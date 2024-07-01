import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int numberOfRandoms = scanner.nextInt();

        Set<Integer> uniqueOddNumbers = new HashSet<>();
        Set<Integer> uniqueEvenNumbers = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < numberOfRandoms; i++) {
            int randomNumber = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            if (randomNumber % 2 == 0) {
                uniqueEvenNumbers.add(randomNumber);
            } else {
                uniqueOddNumbers.add(randomNumber);
            }
        }
        System.out.print("Unique odd numbers: ");
        for (int number : uniqueOddNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Unique even numbers: ");
        for (int number : uniqueEvenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        scanner.close();
    }
}
