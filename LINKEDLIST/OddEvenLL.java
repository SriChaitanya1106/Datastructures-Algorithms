package LINKEDLIST;

public class OddEvenLL {
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

    public void EvenOdd(){
        Node curr = head;
        Node EvenHead = null;
        Node EvenTail = null;
        Node OddHead = null;
        Node OddTail = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = null;

            if(curr.data % 2 == 0){
                if(EvenHead == null){
                    EvenHead = EvenTail = curr;
                }else{
                    EvenTail.next = curr;
                    EvenTail = curr;
                }
            }else{
                if(OddHead == null){
                    OddHead = OddTail = curr;
                }else{
                    OddTail.next = curr;
                    OddTail = curr;
                }
            }
            
            curr = temp;
        }
        
        if(EvenHead == null){
            head = OddHead;
            tail = OddTail;
        }else if(OddHead == null){
            head = EvenHead;
            tail = EvenTail;
        }else{
            EvenTail.next = OddHead;
            head = EvenHead;
            tail = OddTail;
        }

        if(tail != null){
            tail.next = null;
        }
    }
    public static void main(String[] args) {
        OddEvenLL ll = new OddEvenLL();
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);
        ll.print();
        ll.EvenOdd();
        ll.print();
    }
}
