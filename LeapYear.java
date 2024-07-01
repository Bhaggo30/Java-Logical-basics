import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year");
        int leapYear = scanner.nextInt();
        if (leapYear%4==0 && leapYear%10!=0 || leapYear%100==0){
            System.out.println("this  year is "+leapYear);
        }
        else {
            System.out.println("this year is not a leapyear"+leapYear);
        }
    }
}
