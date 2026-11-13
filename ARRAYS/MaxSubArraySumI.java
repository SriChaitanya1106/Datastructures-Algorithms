public class MaxSubArraySumI {//Brute force
    public static void PrintMaxSubArraysSum(int numbers[]){
        int curr_sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++ ){
                curr_sum = 0;
                for(int k = i; k <= j; k++){
                    curr_sum += numbers[k];
                }
                System.out.println(curr_sum);
                if(Max_sum < curr_sum){
                    Max_sum = curr_sum;
                }
            }
        }
        System.out.println("Maximum Sum : " + Max_sum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        PrintMaxSubArraysSum(numbers);
    }
}
