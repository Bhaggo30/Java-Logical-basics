import java.util.Scanner;
public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to create its multiplication table : ");
            int number = 5;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Defaulting to 5.");
            }
            generateMultiplicationTable(number);
            scanner.close();
        }
        public static void generateMultiplicationTable(int number) {
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
