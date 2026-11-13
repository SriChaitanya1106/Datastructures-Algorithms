public class SumofNums_inSecondRow{
    public static int Sum(int array[][]){
        int sum = 0;
        for(int j = 0; j <= array[1].length - 1; j++){
            sum += array[1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int array[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(Sum(array));
    }
}