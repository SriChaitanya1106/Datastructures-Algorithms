package STACKS;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static void MaxArea(int[] heights){
        //Next smaller right
        int nsr[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i = nsr.length-1; i >= 0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = nsr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        int nsl[] = new int[heights.length];
        s = new Stack<>();
        for(int i = 0; i < nsl.length; i++){
            while(!s.isEmpty() && heights[s.peek()]  >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //caluculate max area
        int maxArea = 0;
        int width;
        int currArea;
        for(int i = 0; i < heights.length; i++){
            width = nsr[i] - nsl[i] - 1;
            currArea = heights[i] * width;
            maxArea = Math.max(maxArea,currArea);
        }
        System.out.println("Max area  in histogram is : "+maxArea);
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        MaxArea(heights);
    }
}
