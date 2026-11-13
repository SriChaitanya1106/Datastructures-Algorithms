public class MaxSubArraySumIII { // Kadanes algorithm.
    public static void PrintMaxSubArraysSum(int numbers[]){
        int curr_sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            curr_sum += numbers[i];
            if(curr_sum < 0){
                curr_sum = 0;
            }
            Max_sum = Math.max(curr_sum,Max_sum);
        }
        System.out.println("our Maximum sub array sum is : " + Max_sum);
    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        PrintMaxSubArraysSum(numbers);
    }
}
