package ARRAYLIST;
/*
  Array                                   ArrayList
1. fixed size                             Dynamic size 
2. Primitive datatypes can be stored.     Primitive datatypes cant be stored directly.
Ex: we do not use int we use Integer.
*/
import java.util.*;
public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        
        //add operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9); // 1 is index and 9 is value to be added other values shift to right it take O(n)
        System.out.println(list);

        //get operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Delete - O(n)
        list.remove(2);
        System.out.println(list);

        //set - O(n)
        list.set(2,10);
        System.out.println(list);

        //Contains - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //size
        System.out.println(list.size());
    }
}
