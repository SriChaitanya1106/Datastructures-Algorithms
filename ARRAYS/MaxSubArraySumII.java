public class MaxSubArraySumII { // Prefix Sum
    public static void PrintMaxSubArraysSum(int numbers[]){
        int curr_sum = 0;
        int Max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++ ){
                curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if(Max_sum < curr_sum){
                    Max_sum = curr_sum;
                }
            }
        }
        System.out.println("Maximum Sum : " + Max_sum);
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        PrintMaxSubArraysSum(numbers);
    }
}
