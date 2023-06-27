class UseStatic{
    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("X = " + x);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    static{
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
        System.out.println("b = " + UseStatic.b);
    }
}