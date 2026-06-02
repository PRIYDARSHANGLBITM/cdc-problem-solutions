package Recursion;

public class Firstoccurence {
    public static int FirstOccurences(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurences(arr,key,i+1);
    }
    public static void main(String[]args){
        int arr[]={13,5,4,33,7,6,5,4,3,2,2};
        System.out.println(FirstOccurences(arr,5,0));
    }
}
