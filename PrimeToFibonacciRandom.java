import java.util.*;
public class PrimeToFibonacciRandom {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the lower bound of the range: ");
            int lowerBound = scanner.nextInt();
            System.out.print("Enter the upper bound of the range: ");
            int upperBound = scanner.nextInt();
            System.out.print("Enter the number of random numbers to generate: ");
            int numberOfRandoms = scanner.nextInt();

            int[] randomNumbers = new int[numberOfRandoms];
            Random random = new Random();
            for (int i = 0; i < numberOfRandoms; i++) {
                randomNumbers[i] = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            }
            System.out.println("Random Numbers that are in the Fibonacci sequence:");
            for (int number : randomNumbers) {
                if (isFibonacci(number)) {
                    System.out.println(number + " is a Fibonacci number.");
                } else {
                    System.out.println(number + " is not a Fibonacci number.");
                }
            }

            scanner.close();
        }
        public static boolean isFibonacci(int number) {
            if (number < 0) {
                return false;
            }
            return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4);
        }
        public static boolean isPerfectSquare(int number) {
            int sqrt = (int) Math.sqrt(number);
            return (sqrt * sqrt == number);
        }
    }


