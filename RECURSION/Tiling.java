package RECURSION;

public class Tiling {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int verticalTiles = tilingProblem(n-1);
        int horizontalTiles = tilingProblem(n-2);
        int totWays = verticalTiles + horizontalTiles;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
