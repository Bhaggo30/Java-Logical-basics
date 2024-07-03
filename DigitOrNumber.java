import java.util.Scanner;

public class DigitOrNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the integer value");
        int x = scanner.nextInt();
        if (x >= -9  && x<=9){
            System.out.println(x+ "is a digit");
        }
        else {
            System.out.println(x+ " is a number");
        }
    }
}
