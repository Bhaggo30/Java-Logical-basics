import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("addition of two number "+(a+b));
        System.out.println("subtraction of two number "+(a-b));
        System.out.println("multiplication of two number is "+(a*b));
        System.out.println("division of two number is "+(a%b));
        System.out.println("modulus of two number is "+(a/b));



    }
}
