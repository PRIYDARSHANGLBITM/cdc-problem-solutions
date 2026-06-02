public class MinimumSizeSubArraySum {
    public static int subarraysum(int target, int[]nums){
        int left=0;
        int sum = 0;
        int minlength = Integer.MAX_VALUE;
        for(int right =0; right<nums.length;right++){
            sum = sum+nums[right];
            while(sum>= target){
                minlength = Math.min(minlength,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }else{
            return minlength;
        }
    }
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = subarraysum(target,nums);
        System.out.println("Minimum length of Sub Array:  "+ result);
    }
}
