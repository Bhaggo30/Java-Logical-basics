public class DivisionOf3And5 {
    public static void main(String[] args) {
        System.out.println("\n number is divisible by 3");
        for (int i=1; i<100; i++){
            if (i%3 == 0){
                System.out.print(+i+ " ,");
            }
        }
        System.out.println("\nnumber is divisible by 5");
        for (int i =1; i<100; i++){
            if (i%5==0){
                System.out.print(+i+ " ,");
            }
        }
        System.out.println("\n number is divisible by 3 and 5 both");
        for (int i =0; i<100; i++){
            if (i%3==0 && i%5==0){
                System.out.print(+i+ " ,");
            }
        }

    }
}
