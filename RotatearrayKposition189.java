class RotatearrayKposition189 {
    public static void main(String[]args){
        RotatearrayKposition189 r =new RotatearrayKposition189();
        int[]nums={1,2,3,4,5,6,7,8,9};
        int k=3;
        r.rotate(nums,k);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       k=k%n;
       reverse(nums,0,n-1);
       reverse(nums,0,k-1);
       reverse(nums,k,n-1); 
    }
    void reverse (int[]nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}