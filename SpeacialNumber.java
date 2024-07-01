import java.util.Scanner;

public class SpeacialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int d1 = n/10;
        int d2 = n%10;
        int sum = d1+d2 + d1*d2;
        if (sum == n ){
            System.out.println(n+ " is a speacial number");
        }
        else{
            System.out.println(n+ "is not a speacial number");
        }
    }
}
