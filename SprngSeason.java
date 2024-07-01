import  java.util.Scanner;
public class SprngSeason {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter day (1-31): ");
            int day = scanner.nextInt();

            boolean isSpring = isSpringSeason(month, day);

            System.out.println(isSpring);
            scanner.close();
        }
        public static boolean isSpringSeason(int month, int day) {
            if (month == 2 && day >= 28) {
                return true;
            }
            else if (month == 3 && day>=30) {
                return true;
            }
            else if (month == 4 && day <= 31) {
                return true;
            }
            else {
                return false;
            }
        }
    }


