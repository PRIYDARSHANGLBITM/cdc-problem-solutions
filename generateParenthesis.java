import java.util.ArrayList;
import java.util.List;
public class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String>result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    private void backtrack(List<String>result, String curr, int open, int close, int n){
        if (curr.length() == 2*n ){
            result.add(curr);
            return;
        }
        if (open<n){
            backtrack(result,curr+"(",open+1,close,n);
        }
        if(close < open){
            backtrack(result,curr+")",open,close+1,n);
        }
    }
    public  void main(String[] args) {
        int n=3;
        List<String> ans = generateParenthesis(n);
        System.out.println("Valid Parenthesis Combinations :");
        for(String s: ans){
            System.out.println(s);
        }
    }
}