public class Palindromenumber {
    public boolean isPalindrome(int x){
        if(x<0||x%10==0&&x!=0)
            return false;
            int original = x;
            int reverse=0;
            while(x>0){
                int digit=x%10;
                reverse=reverse*10+digit;
                x=x/10;
            }
            return original==reverse;
        }
        public static void main (String[] args){
            Palindromenumber abc = new Palindromenumber();
            int num = 58985;
            System.out.println("Is "+num+" a palindrome? "+abc.isPalindrome(num));
        }
    }