public class Largest_in_array {
    public static int getLargest(int numbers[]){
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;
       for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
       }
       System.out.println("Smallest in the array is : "+ smallest);
       return largest;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,5,6,9};
        System.out.println("Largest in the array is : "+ getLargest(numbers));
    }
}
