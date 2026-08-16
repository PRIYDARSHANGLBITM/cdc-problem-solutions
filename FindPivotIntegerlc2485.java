public class FindPivotIntegerlc2485 {
    public int pivotInteger(int n){
        int totalSum = n*(n+1)/2;
        int x = (int)Math.sqrt(totalSum);
        if(x*x == totalSum){
            return x;
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIntegerlc2485 obj = new FindPivotIntegerlc2485();
        int n=10;
        int pivot  = obj.pivotInteger(n);
        System.out.println("pivot integer is : "+ pivot);
}
}