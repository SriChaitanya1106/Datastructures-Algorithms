package LINKEDLIST;

public class DeleteNafterM {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNafterM(int N,int M){
        if(M < 0 || N < 0){
            System.out.println("Invalid values");
            return;
        }

        if(M == 0){
            head = tail = null;
            size = 0;
            return;
        }

        if(N == 0 || head == null){
            return;
        }

        Node curr = head;
        while(curr != null){
            //retain M nodes
            for(int i = 1; i < M && curr != null; i++){
                curr = curr.next;
            }

            if(curr == null){
                break;
            }

            //delete next N nodes
            Node temp = curr.next;
            for(int j = 0; j < N && temp != null; j++){
                temp = temp.next;
                size--;
            }

            //connect retained node to remaining list
            curr.next = temp;

            //update tail if deletion reached the end
            if(temp == null){
                tail = curr;
            }
            //continue from remaining nodes
            curr = temp;
        }
    }
    public static void main(String[] args) {
        DeleteNafterM ll = new DeleteNafterM();
        for(int i = 1; i <= 8; i++){
            ll.addLast(i);
        }
        int M = 2;
        int N = 2;
        System.out.println("Original Linked List:");
        ll.print();
        ll.deleteNafterM(M,N);
        System.out.println("After Deletion:");
        ll.print();
        System.out.println("Size: " + size);
    }
}
