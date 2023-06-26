package AccessModifier;


public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.print1();
        
        // test.print2(); 
        // print2() has private access in AccessModifier.Test(compiler.err.report.access)
        // The method print2() from the type Test is not visible

        test.print3();
        test.print4();
    }
}