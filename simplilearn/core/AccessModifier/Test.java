package AccessModifier;

public class Test {
    public void print1(){
        System.out.println("Hello World");
    }
    private void print2(){ 
        // The method print2() from the type Test is never used locally
        System.out.println("Hello World");
    }
    protected void print3(){
        System.out.println("Hello World");
    }
    void print4(){
        System.out.println("Hello World");
    }
}
