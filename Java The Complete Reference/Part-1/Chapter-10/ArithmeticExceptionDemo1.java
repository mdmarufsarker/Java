public class ArithmeticExceptionDemo1 {
    public static void main(String[] args) {
        int d, a;
        try{
            d = 0;
            a = 42 / 0;

            System.out.println("This will no be printed");
        }catch(ArithmeticException err){
            System.out.println("Division by zero");
        }
    }
}
