public class linearsearch {
    public static int ls(int numbers[], int target){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] ={5,23,43,21,10,34,32,45,55,23,76,89};
        int target = 10;

        int index=ls(numbers,target);
        if(index==-1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index: "+ index);
        }
    }
}
