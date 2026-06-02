public class Reversewordinastring{
    public static String reverseString(String s){
        String[] words = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            if(words[i].equals("")){
                continue;
            }
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[]args){
        System.out.println(reverseString("ram is    a good boy "));
    }
}