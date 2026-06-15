public class climbStairs {
    public int climbStair(int n){
        if(n<=0){
            return n;
        }
        int first =1;
        int second =2;
        for(int j=3;j<=n;j++){
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
    public static void main(String[]args){
        climbStairs cl = new climbStairs();
        int n=7;
        int result = cl.climbStair(n);
        System.out.println("Number of ways: " + result);
    }
}
