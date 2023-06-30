public class FinallyDemo {
    // throw an exception out of the method
    static void procA(){
        try{
            System.out.println("Inside proc A");
            throw new RuntimeException("demo");
        }finally{
            System.out.println("proc A's finally");
        }
    }

    // return from within a try block
    static void procB(){
        try{
            System.out.println("Inside proc B");
            return;
        }finally{
            System.out.println("proc B's finally");
        }
    }

    // execute a try block normally
    static void procC(){
        try{
            System.out.println("Inside proc C");
        }finally{
            System.out.println("proc C's finally");
        }
    }
    public static void main(String[] args) {
        try{
            procA();
        }catch(Exception err){
            System.out.println("Exception caught");
        }

        procB();
        procC();
    }
}

/*
Inside proc A
proc A's finally
Exception caught
Inside proc B
proc B's finally
Inside proc C
proc C's finally
*/