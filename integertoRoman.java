import java.util.*;
public class integertoRoman{
    public String intToRoman(int num){
        int[]val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[]symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result=new StringBuilder();
        for(int i=0;i<13;i++){
            if(num==0){
                break;
            }
            int times = num/val[i];
            while(times --> 0){
                result.append(symbol[i]);
            }
            num=num%val[i];
        }
        return result.toString();
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Number: ");
        int integer =sc.nextInt();
        integertoRoman ir = new integertoRoman();
        String result = ir.intToRoman(integer);
        System.out.println("Roman Number is "+result);
        sc.close();
    }
}