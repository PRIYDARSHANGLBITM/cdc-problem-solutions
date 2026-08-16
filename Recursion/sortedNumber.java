package Recursion;

public class sortedNumber {
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1 ){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted (arr, i+1);
    }
    public static void main (String[]args){
        int arr[] = {3,4,6,8,9,66,5,67,75,98};
        System.out.println(isSorted(arr,0));
    }
}
