public class Removeduplicatesortedarray26 {
    public static void main (String[]args){
        Removeduplicatesortedarray26 duplicate = new Removeduplicatesortedarray26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4,5};
        int k = duplicate.removeDuplicates(nums);
        System.out.println("Unique element count: "+ k);
        System.out.println("Array after remove duplicate: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}