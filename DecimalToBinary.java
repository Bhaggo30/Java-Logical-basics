import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("enter the binary digit ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int [] rem = new int[20];
        int index =0;
        while (num>0){
            rem[index] = num %2;
            index++;
            num = num/2;

        }
        for (int i = index-1; i>=0; i--)
        {
            System.out.print(rem[i]);
        }
    }
}
