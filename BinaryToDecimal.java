import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("enter the binary value to convert decimal value");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int placevalue = 1;
        int converting_Value = 0;
        while (n != 0){
            int lastDigit = n%10;
            n = n/10;
            converting_Value = converting_Value+placevalue*lastDigit;
            placevalue =2*placevalue;
        }
        System.out.println(converting_Value);
    }
}
