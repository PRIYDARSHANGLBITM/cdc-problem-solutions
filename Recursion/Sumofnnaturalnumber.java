package Recursion;

public class Sumofnnaturalnumber {
    public static int SumNatural(int n){
        if(n==1){
            return 1;
        }
        int snm1 = SumNatural(n-1);
        int Sn = n + snm1;
        return Sn;
    }
    public static void main(String[]args){
        int n= 5;
        System.out.println(SumNatural(n));
    }
}
