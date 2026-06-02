import java.util.*;
public class findpermutations{
    public List<List<Integer>> permute(int[]nums){
        List<List<Integer>> result = new ArrayList<>();
        findthepermutations(nums,result,new ArrayList<>(),new boolean[nums.length]);
        return result;
    }
    private void findthepermutations(int[]nums,List<List<Integer>> result,List<Integer>currList, boolean[]usedVals){
        if(nums.length==currList.size()){
            result.add(new ArrayList<>(currList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(usedVals[i]==true){
                continue;
            }
            currList.add(nums[i]);
            usedVals[i]=true;

            findthepermutations(nums,result,currList,usedVals);
            currList.remove(currList.size()-1);
            usedVals[i]=false;
        }
    }


    public static void main (String[]args){
        findpermutations fp= new findpermutations();
        int nums[]={4,5,6};
        List<List<Integer>> answer = fp.permute(nums);
        System.out.println(answer);
    }
}