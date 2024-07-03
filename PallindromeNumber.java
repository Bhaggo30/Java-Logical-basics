import java.util.Scanner;

public class PallindromeNumber {
    public static boolean isPallindrome(int x){
        int rev =0;
        int temp = x;
        while (x!=0) {
            int r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }
        return rev == temp;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a number");
        int n = scanner.nextInt();
        boolean rs = isPallindrome(n);
        if (rs == true){
            System.out.println(n+ " is a pallindrome");
        }
        else{
            System.out.println(n+ " is not a pallindrome");
        }

    }
}
