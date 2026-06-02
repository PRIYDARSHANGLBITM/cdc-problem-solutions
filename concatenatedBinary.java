import java.util.*;
public class concatenatedBinary{
    public static int ConcatenatedBinarys(int n){
        long result=0;
        int length = 0;
        int mod = 1000000007;

        for (int i=1;i<=n;i++){
            if((i&(i-1))==0){
                length++;
            }
            result= ((result<<length)|i )%mod;
        }
        return (int)result;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int answer= ConcatenatedBinarys(n);
        System.out.println("Concatenated binary result : "+ answer );
        sc.close();
    }
}