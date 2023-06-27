class Tst1{
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Tst1 t = new Tst1();

        int a = 15, b = 20;

        System.out.println("Before call: " + a + " " + b);
        t.meth(a, b);
        System.out.println("After call: " + a + " " + b);
    }
}
