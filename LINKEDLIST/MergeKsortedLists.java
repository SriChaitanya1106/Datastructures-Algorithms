package LINKEDLIST;

public class MergeKsortedLists {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

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
    //merge two sorted LL
    public Node SortedMerge(Node a, Node b){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(a!= null && b!=null){
            if(a.data <= b.data){
                temp.next = a;
                a = a.next;
            }else{
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        if(a != null){
            temp.next = a;
        }else{
            temp.next = b;
        }
        return dummy.next;
    }
    //merge k sortedLL
    public Node MergeK(Node lists[]){
        if(lists.length == 0){
            return null;
        }
        
        Node result = lists[0];

        for(int i = 1; i < lists.length; i++){
            result = SortedMerge(result, lists[i]);
        }
        return result;
    }

    public static void printList(Node node) {
        while(node != null){
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        MergeKsortedLists l1 = new MergeKsortedLists();
        MergeKsortedLists l2 = new MergeKsortedLists();
        MergeKsortedLists l3 = new MergeKsortedLists();

        l1.addLast(1);
        l1.addLast(3);
        l1.addLast(5);
        l1.addLast(7);

        l2.addLast(2);
        l2.addLast(4);
        l2.addLast(6);
        l2.addLast(8);

        l3.addLast(0);
        l3.addLast(9);
        l3.addLast(10);
        l3.addLast(11);

        Node lists[] = {l1.head, l2.head, l3.head};

        MergeKsortedLists obj = new MergeKsortedLists();

        Node result = obj.MergeK(lists);

        printList(result);
    }

}
