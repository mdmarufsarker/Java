import java.util.*;

public class ArithmeticExceptionDemo2 {
    public static void main(String[] args) {
        int ans = 0, b = 0, c = 0;
        Random r = new Random();

        for(int i = 0; i < 32000; i++){
            try{
                b = r.nextInt();
                c = r.nextInt();

                ans = 12345 / (b / c);
            }catch(ArithmeticException err){
                System.out.println("Division By Zero");
            }finally{
                System.out.println("Result = " + ans);
            }
        }
    }
}
