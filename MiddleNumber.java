import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  first number");
        int first = sc.nextInt();
        System.out.println("enter a second number");
        int second = sc.nextInt();
        System.out.println("enter a third number");
        int third = sc.nextInt();
        if (first>second && first<third || first>third && first<second){
            System.out.println(first+ " is a middle number");
        } else if (second>first && second<third || second>third && second>first) {
            System.out.println(second+ " is a middle number");
        }
        else{
            System.out.println(third+ " is a middle number");
        }
    }
}
