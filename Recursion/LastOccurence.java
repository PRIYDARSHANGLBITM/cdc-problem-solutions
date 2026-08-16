package Recursion;

public class LastOccurence {
    public static int lastOccurences(int arr[],int key ,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurences(arr,key,i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[]args){
        int arr[]= {3,4,5,3,2,5,6,7,5,89,7,5,4,4,5,4};
        System.out.println(lastOccurences(arr,5,0));
    }
}
