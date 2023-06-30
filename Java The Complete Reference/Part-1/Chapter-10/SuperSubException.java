/*
 * This program contains an error
 * 
 * A subclass must come before its superclass in a series of catch statements. If not, unreachable code will be created and a compile-time error will result.
 */

public class SuperSubException {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        }catch(Exception err){
            System.out.println("Generic exception catch");
        }
        /*
         * This exception is never reached because ArithmeticException is a subclass of Exception
         */
        catch(ArithmeticException err){
            System.out.println("This is never reached");
        }
    }
}
