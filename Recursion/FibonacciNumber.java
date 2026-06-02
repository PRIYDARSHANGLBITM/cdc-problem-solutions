public class FibonacciNumber{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fn = fibnm1 + fibnm2;
        return fn;
        }
        public static void main (String[]args){
        int n=15;
        System.out.println(fib(n));
    }
    }
   