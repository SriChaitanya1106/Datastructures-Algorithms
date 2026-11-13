package Stacks;

import java.util.Stack;

public class SimplifyPath {
    public static String simplify(String path){
        String arr[] = path.split("/");
        Stack<String> s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].isEmpty() || arr[i].equals(".")){
                continue;
            }else if(arr[i].equals("..")){
                if(s.isEmpty()){
                    continue;
                }else{
                    s.pop();
                }
            }else{
                s.push(arr[i]);
            }
        }
        String result = "/" + String.join("/",s);
        return result;
    } 
    public static void main(String[] args) {
        String path = "/a/../../b";
        System.out.println(simplify(path));
    }
}
