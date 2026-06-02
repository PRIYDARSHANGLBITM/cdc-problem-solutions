public class Sumof1dArray {
    public static int[] runningSum(int[]nums){
        for (int i=1;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {8,2,5,7,9,4,1,2,3};
        int[] result = runningSum(nums);
        for (int sum : result){
            System.out.print(sum +" ");
        }
    }
}
