import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to a table to be printed");
        int n = scanner.nextInt();
        for (int i =0; i<10; i++){
            System.out.println(n+ "x" +(i+1)+ " =" +(n*(i+1)));
        }
    }
}
