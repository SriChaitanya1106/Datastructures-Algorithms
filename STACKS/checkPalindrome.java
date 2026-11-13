package Stacks;
import java.util.*;
public class checkPalindrome{
    public static void CheckPalindrome(LinkedList<Character> ll){
        Stack<Character> s = new Stack<>();
        Iterator<Character> it = ll.iterator();
        while(it.hasNext()){
            char ch = it.next();
            s.push(ch);
        }

        Iterator<Character> it2 = ll.iterator();
        while(it2.hasNext()){
            char ch = it2.next();
            if(ch != s.peek()){
                System.out.println("Not Palindrome");
                return;
            }
            s.pop();
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('c');
        ll.addLast('B');
        ll.addLast('A');

        CheckPalindrome(ll);
    }
}