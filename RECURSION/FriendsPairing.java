package RECURSION;

public class FriendsPairing {
    public static int friendspairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // int single = friendspairing(n-1);
        // int pair = friendspairing(n-2);
        // int pairWays = (n-1)*pair;

        // int totWays = single + pairWays;
        // return totWays;
        return friendspairing(n-1) + (n-1)*friendspairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }
}
