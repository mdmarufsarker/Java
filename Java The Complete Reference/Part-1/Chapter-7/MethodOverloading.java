class Demo1{
    void test(){
        System.out.println("No Parameters");
    }

    void test(int a){
        System.out.println("A = " + a);
    }

    void test(int a, int b){
        System.out.println("A and B = " + a + " " + b);
    }

    double test(double a){
        System.out.println("Double A = " + a);
        return a * a;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Demo1 ob = new Demo1();

        double result;

        // calling all the versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.43);

        System.out.println("Result of ob.test(123.43) = " + result);
    }    
}
