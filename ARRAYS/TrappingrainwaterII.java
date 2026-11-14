public class TrappingrainwaterII {
    public static int trappedwater(int[] height){
        int result = 0;
        int l = 0;
        int r = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while(l < r){
            leftMax = Math.max(leftMax,height[l]);
            rightMax = Math.max(rightMax, height[r]);
            if(leftMax < rightMax){
                result = result + (leftMax - height[l]);
                l++;
            }else{
                result = result + (rightMax - height[r]);
                r--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] height = {7,0,4,2,5,0,6,4,0,5};
        System.out.println(trappedwater(height));
    }
}
