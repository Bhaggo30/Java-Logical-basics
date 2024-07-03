import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three integer value");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x>y && x>z){
            System.out.println(x+ " is the biggest number");
        }
        else if (y>z){
            System.out.println(y+ " is the biggest number");
        }
        else{
            System.out.println(z+ " is the biggest number");
        }
    }
}
