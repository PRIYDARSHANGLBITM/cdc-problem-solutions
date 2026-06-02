import java.util.*;
public class findpermutationunique47{
    public List<List<Integer>> uniquepermutes(int[]nums){
        List<List<Integer>> result = new ArrayList<>();
        boolean[]used= new boolean [nums.length];
        Arrays.sort(nums);
        finduniquepermutes(nums,result,new ArrayList<>(),used);
        return result;
    }
    private void finduniquepermutes(int[]nums,List<List<Integer>> result,List<Integer> currList,boolean[]used){
        if(currList.size()==nums.length){
            result.add(new ArrayList<>(currList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            currList.add(nums[i]);
            used[i]=true;

            finduniquepermutes(nums,result,currList,used);
            currList.remove(currList.size()-1);
            used[i]=false;
        }
    }
    public static void main(String[]args){
        findpermutationunique47 fpm = new findpermutationunique47();
        int[]nums = {9,3,6,3};
        List<List<Integer>> answer = fpm.uniquepermutes(nums);
        System.out.println(answer);
    }
}