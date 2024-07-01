import java.util.Random;
import java.util.Scanner;

public class PrimeFactorizationRandom {
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
        for (int number : randomNumbers) {
            System.out.print("Prime factors of " + number + ": ");
            findAndPrintPrimeFactors(number);
            System.out.println();
        }
        scanner.close();
    }
    public static void findAndPrintPrimeFactors(int number) {
        int[] primeFactors = new int[100]; 
        int index = 0; 
        
        while (number % 2 == 0) {
            primeFactors[index++] = 2;
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeFactors[index++] = i;
                number /= i;
            }
        }
        if (number > 2) {
            primeFactors[index++] = number;

            }
        for (int i = 0; i < index; i++) {
            System.out.print(primeFactors[i] + " ");
        }
    }
}
