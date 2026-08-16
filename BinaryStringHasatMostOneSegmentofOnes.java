import java.util.*;
public class BinaryStringHasatMostOneSegmentofOnes{
    public static boolean BinaryoneSegment(String s){
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'&&(i==0||s.charAt(i-1)=='0')){
                count++;
            }
        }
        return count<=1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary String: ");
        String s = sc.nextLine();
        boolean result= BinaryoneSegment(s);
        System.out.println(result);
        sc.close();
    }
}