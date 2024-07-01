import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int num){
        int fact =1;
        while (num>1){
            fact = fact*num;
            num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int fact = getFactorial(n);
        System.out.println("factorial of a given number is "+fact);
    }
}
