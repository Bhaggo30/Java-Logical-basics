import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the four subject marks ");
        int java = sc.nextInt();
        int sql = sc.nextInt();;
        int javascript = sc.nextInt();
        int logical = sc.nextInt();
        if (java>=35 && sql>=35 && logical>=35 && javascript>=35){
            System.out.println("result is pass");
        }
        else {
            System.out.println("result is fail");
        }
    }
}
