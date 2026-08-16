import java.util.Arrays;

public class CanMakeArithmeticProgressionlc1502 {
    public boolean canMakeArithmeticProgression(int[]arr){
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        CanMakeArithmeticProgressionlc1502 obj= new CanMakeArithmeticProgressionlc1502();
        int arr[]={10,4,8,6,2};
        System.out.println(obj.canMakeArithmeticProgression(arr));
    }
}
