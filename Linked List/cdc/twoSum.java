public class twoSum{
    public int[] twosum(int[]nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    return new int []{i,j};
                }
            }
        }
        return new int []{};
    }
    public static void main(String[]args){
        twoSum sum = new twoSum();
        int[]nums = {2,7,8,9,22,43,12,2,5};
        int target = 9;
        int[] result = sum.twosum(nums,target);
        System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + " and " + result[1]);
    }
}