import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int numberOfRandoms = scanner.nextInt();

        int[] randomNumbers = new int[numberOfRandoms];
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < numberOfRandoms; i++) {
            randomNumbers[i] = lowerBound + random.nextInt(upperBound - lowerBound + 1);
        }
        for (int number : randomNumbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        System.out.print("Prime numbers: ");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
        System.out.println();
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
