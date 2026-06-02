public class SortarrayBubbleSort {
    public int[] sortArray(int[] nums){
        int n= nums.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        SortarrayBubbleSort sorted = new SortarrayBubbleSort();
        int nums[]={5,2,1,3,4};
        int[] result = sorted.sortArray(nums);
        for (int num: result){
            System.out.print(num + " ");
        }
    }
}
