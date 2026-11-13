public class Duplicates_in_Array {
    public static Boolean FindDuplicates(int numbers[]) {
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,1};
        System.out.println(FindDuplicates(numbers));
    }
}
