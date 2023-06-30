public class ThrowsDemo {
    static void throwOne() throws IllegalAccessError{
        System.out.println("Inside throwone");
        throw new IllegalAccessError("demo");
    }
    public static void main(String[] args) {
        try{
            throwOne();
        }catch(IllegalAccessError err){
            System.out.println("Caught: " + err);
        }
    }
}
