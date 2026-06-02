public class  Example{
    public static void main(String[] args) {
        System.out.println("Started the program");
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int result = n1/n2;
        System.out.println("The result of " + n1 + " divided by " + n2 + " is: " + result);
        System.out.println("Terminated the program");
    }
}