class Outer1{
    int outer_x = 100;

    void test(){
        Inner1 inner = new Inner1();
        inner.display();
    }

    class Inner1{
        void display(){
            System.out.println("Display: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
