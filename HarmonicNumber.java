import java.util.Scanner;


public class HarmonicNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number for finding nth harmonic number: ");
            int n = scanner.nextInt();
            double harmonicNumber = computeHarmonicNumber(n);
            System.out.println("The " + n + "th harmonic number is " + harmonicNumber);
            scanner.close();
        }
        public static double computeHarmonicNumber(int n) {
            double result = 0.0;
            for (int i = 1; i <= n; i++) {
                result += 1.0 / i;
            }
            return result;
        }
    }


