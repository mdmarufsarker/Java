class Tst2{
    int a, b;

    Tst2(int i, int j){
        a = i;
        b = j;
    }

    void meth(Tst2 o){
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        Tst2 t = new Tst2(15, 20);

        System.out.println("Before call: " + t.a + " " + t.b);
        t.meth(t);
        System.out.println("After call: " + t.a + " " + t.b);
    }
}
