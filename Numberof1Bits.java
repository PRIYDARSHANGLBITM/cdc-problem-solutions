public class Numberof1Bits{
    public static int NumberBits(int n){
        int count =0;
        while(n!=0){
            n= n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[]args){
        int n = 15;
        int result = NumberBits(n);
        System.out.println("Number of 1 Bits : "+result);
    }
}