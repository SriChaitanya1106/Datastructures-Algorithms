package RECURSION;

public class xPowern {
    //Brute force:
    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     return x * power(x,n-1);
    // }

    public static int OptimizedPower(int a,int n) {
        if(n == 0){
            return 1;
        }
        int halfPower = OptimizedPower(a, n/2);
        int halfPowersq = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        System.out.println(OptimizedPower(2, 10));
    }
}
