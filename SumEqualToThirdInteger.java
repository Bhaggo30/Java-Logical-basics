import java.util.Scanner;

public class SumEqualToThirdInteger {
    public static boolean sumOfTwo(int x, int y,int z){
        return  ((x+y) == z || (y+z)==x || (z+x)==y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first integer value ");
        int x = sc.nextInt();
        System.out.println("enter first integer value ");
        int y = sc.nextInt();
        System.out.println("enter first integer value ");
        int z = sc.nextInt();
        System.out.println("sum of given integer is "+sumOfTwo(x,y,z));
    }
}
