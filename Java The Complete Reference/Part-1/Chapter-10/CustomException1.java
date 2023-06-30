class MyException1 extends Exception{
    private int detail;

    MyException1(int a){
        detail = a;
    }

    public String toString(){
        return "MyException[" + detail + "]";
    }
}

public class CustomException1 {
    static void compute(int a) throws MyException1{
        System.out.println("Called compute(" + a + ")");

        if(a > 10){
            throw new MyException1(a);
        }else{
            System.out.println("Normal exit");
        }
    }
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }catch(MyException err){
            System.out.println("Caught: " + err);
        }
    }
}
