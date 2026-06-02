public class MonobitNumber{
    public int countMonobit(int n){
        int count = 0;
        count++;
        int power=1;
        while(true){
            int monobit=power-1;
            if (monobit>n) break;
            if(monobit!=0) count++;
            power=power*2;
        }
        return count;
    }
    public static void main(String[]args){
        MonobitNumber mn=new MonobitNumber();
        int n=10;
        int result= mn.countMonobit(n);
        System.out.println("count of monobit number from 0 to "+n+"="+result);
    }
}