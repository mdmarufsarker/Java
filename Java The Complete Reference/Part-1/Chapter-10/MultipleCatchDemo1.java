public class MultipleCatchDemo1 {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);

            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        }catch(ArithmeticException err){
            System.out.println("Divide by 0");
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Array index out of bounds");
        }finally{
            System.out.println("After an try / catch blocks");
        }
    }
}
