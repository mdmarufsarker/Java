// create a superclass
class A{
    int i, j;

    void showij(){
        System.out.println("i and j = " + i + " " + j);
    }
}

// create a subclass
class B extends A{
    int k;

    void showk(){
        System.out.println("k = " + k);
    }

    void sum(){
        System.out.println("i + j + k = " + (i + j + k));
    }
}

public class SimpleInhertence {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // the superclass maybe used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superob: ");
        superOb.showij();

        // the subclass has access to all public members of its superclass
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subob: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        // sum of i, j and k
        System.out.println("Sum of i, j and k = ");
        subOb.sum();
    }
}
