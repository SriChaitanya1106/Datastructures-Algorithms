package LINKEDLIST;
import java.util.LinkedList;
public class LinkedList_inJFC {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addFirst(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
