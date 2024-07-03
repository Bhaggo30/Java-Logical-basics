public class FibonacciNumber {
    public static void printFibonacci(int n){
        int f1 =0, f2 =1,count =0;
        while (count<n){
            System.out.println(f1+ " ");
            int f3 = f1+f2;
            f1 =f2;
            f2 =f3;
            count++;
        }
    }
    public static void main(String[] args) {
        System.out.println("fibonacci series are");
        printFibonacci(5);

    }
}
