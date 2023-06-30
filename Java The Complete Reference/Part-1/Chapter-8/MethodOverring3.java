class AAAA{
    int i, j;
    AAAA(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i and j = " + i + " " + j);
    }
}

class BBBB extends AAAA{
    int k;

    BBBB(int a, int b, int c){
        super(a, b);
        k = c;
    }

    // overload show()
    void show(String msg){
        System.out.println(msg + k);
    }
}

public class MethodOverring3 {
    public static void main(String[] args) {
        BBBB ob = new BBBB(1, 2, 3);
        ob.show("This is k = ");
        ob.show();
    }
}
