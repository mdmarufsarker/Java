public class TryWithMethod {
    static void nesttry(int a){
        try{
            /*
            * If one command line arg is used, then a divide by zero exception will be generated by the following code.
            */
            if(a == 1){
                a = a / (a - a); // divide by zero
            }
            /*
            * If two command line args are used, then generate an array index out of bounds exception.
            */
            if(a == 2){
                int c[] = {1};
                c[42] = 99; // generate an array index out of bounds exception
            }
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Array index out of bounds " + err);
        }
    }
    public static void main(String[] args) {
        try{
            int a = args.length;

            /*
            * If no command line args are present, the following statement will generate a divide by zero exception.
             */
            int b = 42 / a;
            System.out.println("a = " + a);

            nesttry(a);
        }catch(ArithmeticException err){
            System.out.println("Divide by zero " + err);
        }
    }
}
