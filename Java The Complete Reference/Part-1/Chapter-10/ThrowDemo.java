public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException err){
            System.out.println("Caught inside demoproc");
            throw err; // rethrow the exception
            // throw new NullPointerException("demo");
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException err){
            System.out.println("Recaught: " + err);
        }
    }
}
