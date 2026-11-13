package LINKEDLIST;

public class SwappingNodesLL {
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

    public void swapNodes(int x, int y){
        if(x==y){
            return;
        }
        Node prevX = null;
        Node currX = head;

        Node prevY = null;
        Node currY = head;

        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null || currY == null){
            System.out.println("One or both nodes not found");
            return;
        }

        if(prevX != null){
            prevX.next = currY;
        }else{
            head = currY;
        }

        if(prevY != null){
            prevY.next = currX;
        }else{
            head = currX;
        }    
        
        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;

        if(currX == tail){
            tail = currY;
        }else if(currY == tail){
            tail = currX;
        }
    }
    public static void main(String[] args) {
        SwappingNodesLL ll = new SwappingNodesLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.swapNodes(2, 4);
        ll.print();
    }
}
