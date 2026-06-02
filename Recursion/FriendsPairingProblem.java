package Recursion;

public class FriendsPairingProblem {
    public static int FriendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1 = FriendsPairing(n-1);
        int fnm2 = FriendsPairing(n-2);
        int PairWays = (n-1)*fnm2;
        int totWays = fnm1+PairWays;
        return totWays;
    }
    public static void main(String[]args){
        System.out.println(FriendsPairing(3));
    }
}
