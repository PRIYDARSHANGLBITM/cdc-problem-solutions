public class TailingProblem{
    public static int TailingProblems(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1 = TailingProblems(n-1);
        int fnm2 = TailingProblems(n-2);
        int totWays = fnm1+fnm2;
        return totWays;
    }
    public static void main (String[]args){
        System.out.println("the total no of ways to tiles fit in horizontal or vertical :  "
         +(TailingProblems(4)));
    }
}