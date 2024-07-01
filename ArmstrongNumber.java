import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int digit = 0;
        int temp;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        System.out.println("number of digit :" + digit);
        temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = (int) (sum + Math.pow(lastDigit, digit));
            temp = temp / 10;
        }
        System.out.println("sum of digit " + sum);
        if (sum == n) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        System.out.println("is armstrong numbet  " + isArmstrong(number));
    }

}