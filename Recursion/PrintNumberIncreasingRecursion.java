
public class PrintNumberIncreasingRecursion {
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[]args){
        int n=20;
        PrintInc(n);
    }
}
