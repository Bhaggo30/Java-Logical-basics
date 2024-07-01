import java.util.Random;
import java.util.Scanner;
public class PrimeNumberTORandomNumber {
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
            System.out.println("Random Numbers and their Prime Factors:");
            int[][] allPrimeFactors = new int[numberOfRandoms][];
            for (int i = 0; i < numberOfRandoms; i++) {
                System.out.print("Prime factors of " + randomNumbers[i] + ": ");
                int[] primeFactors = findPrimeFactors(randomNumbers[i]);
                allPrimeFactors[i] = primeFactors;
                for (int factor : primeFactors) {
                    System.out.print(factor + " ");
                }
                System.out.println();
            }
            System.out.println("\nPrime Factors to Random Numbers:");
            for (int i = 0; i < numberOfRandoms; i++) {
                for (int factor : allPrimeFactors[i]) {
                    System.out.print(factor + " is a factor of " + randomNumbers[i] + "\n");
                }
            }
            scanner.close();
        }
        public static int[] findPrimeFactors(int number) {
            int[] tempFactors = new int[100];
            int index = 0;
            while (number % 2 == 0) {
                tempFactors[index++] = 2;
                number /= 2;
            }
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    tempFactors[index++] = i;
                    number /= i;
                }
            }
            if (number > 2) {
                tempFactors[index++] = number;
            }
            int[] primeFactors = new int[index];
            for (int i = 0; i < index; i++) {
                primeFactors[i] = tempFactors[i];
            }

            return primeFactors;
        }
    }


