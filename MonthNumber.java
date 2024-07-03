import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month number");
        int month = sc.nextInt();
        if (month==1 || month==3 || month ==5 || month==7 || month ==8 ||month ==10|| month==12 ){
            System.out.println("this month have a 31 days");
        } else if (month==4 || month ==6 || month==9 || month==11) {
            System.out.println("this month have a 30 days");

        } else if (month==2) {
            System.out.println("this month have 28 or 29 days");
        }
        else {
            System.out.println("invalid months");
        }
    }
}
