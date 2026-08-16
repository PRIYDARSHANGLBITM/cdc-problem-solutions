public class SearchInsertPosition {
    public static void main (String []args){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        System.out.println("The index of the target element is: " + SearchInsertPosition(nums, target));
    }
    public static int SearchInsertPosition(int[]nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            }
        return low;
    }
}