package LINKEDLIST;

public class IntersectionofTwoLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  Node head;
    public Node tail;
    public int size;

    public void addFirst(int data){// time complexity is O(1)
        //Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //newnode next = head
        newNode.next = head;//link

        //head = newnode
        head = newNode;
    }

    public void addLast(int data){// time complexity is O(1)
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){// time complexity O(n)
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node getIntersectionNode(Node head1,Node head2){
        while(head2 != null){
            Node temp = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        IntersectionofTwoLL ll1 = new IntersectionofTwoLL();
        IntersectionofTwoLL ll2 = new IntersectionofTwoLL();

        //first ll
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);

        //second ll
        ll2.addLast(4);
        ll2.addLast(5);

        //create common nodes
        Node common1 = new Node(6);
        Node common2 = new Node(7);
        common1.next = common2;

        ll1.tail.next = common1;
        ll1.tail = common2;
        ll2.tail.next = common1;
        ll2.tail = common2;

        System.out.println("First Linked List:");
        ll1.print();

        System.out.println("Second Linked List:");
        ll2.print();

        Node intersection = ll1.getIntersectionNode(ll1.head, ll2.head);

        if(intersection != null){
            System.out.println("Intersection found at node: "+ intersection.data);
        }else{
            System.out.println("No intersection found");
        }

    }
}
