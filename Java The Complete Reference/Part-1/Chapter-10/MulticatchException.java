import java.util.Scanner;

public class MulticatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10, b = sc.nextInt();
        int vals[] = {1, 2, 3};

        try{
            int result = a / b; // generate an ArithmeticException

            vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException err){
            System.out.println("Exception caught: " + err);
        }

        System.out.println("After Multi Catch");
        sc.close();
    }
}
