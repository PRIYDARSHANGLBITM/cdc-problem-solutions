import java.util.ArrayList;
import java.util.List;

public class FindallDuplicate {
    public List<Integer> FindDuplicate(int[]nums){
        List<Integer> result= new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (nums[i] <= 0 || nums[i] > nums.length) {
            continue;}
            int index=Math.abs(nums[i])-1;
            if (nums[index]<0){
                result.add(index +1);
            }
            else{
                nums[index]=-nums[index];
            }
        }
        return result;
    }
    public static void main (String[]args){
        FindallDuplicate find=new FindallDuplicate();
        int nums[] = {4,3,2,7,8,2,3,1,4,5,9,0,8,6};
        List<Integer> result = find.FindDuplicate(nums);
        System.out.println(result);
    }
}
    
