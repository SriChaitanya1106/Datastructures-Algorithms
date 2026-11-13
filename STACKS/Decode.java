package STACKS;

import java.util.*;

public class Decode {
    public static String decodeString(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ']'){
                s.push(str.charAt(i));
            }else{
                StringBuilder str1 = new StringBuilder();
                StringBuilder k = new StringBuilder();
                while(s.peek() != '['){
                    str1.append(s.pop());
                }
                str1.reverse();
                s.pop();
                while(!s.isEmpty() && Character.isDigit(s.peek())){
                    k.append(s.pop());
                }
                k.reverse();
                int count = Integer.parseInt(k.toString());
                for(int j = 0; j < count; j++){
                    for(char ch : str1.toString().toCharArray()){
                        s.push(ch);
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!s.isEmpty()) {
            ans.append(s.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "3[b2[v]]L";
        System.out.println(decodeString(str));
    }
}
