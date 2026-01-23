import java.util.*;
public class LetterCombinations {
    List<String>result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length()==0)
            return result;
            String[] map={
                "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
                backtrack(digits,0,new StringBuilder(),map);
                return result;
        }
        private void backtrack (String digits, int index, StringBuilder current,String[]map){
            if(index == digits.length()){
                result.add(current.toString());
                return;
            }
            int digit = digits.charAt(index)-'0';
            String letters = map[digit];

            for(char ch: letters.toCharArray()){
                current.append(ch);
                backtrack(digits,index+1,current,map);
                current.deleteCharAt(current.length() -1);
            }
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter digits (2-9): ");
            String digits=sc.nextLine();
            LetterCombinations obj = new LetterCombinations();
            List<String> ans = obj.letterCombinations(digits);
            System.out.println("output combinations: ");
            System.out.println(ans);
            sc.close(); 
        }
    }
