class AAA{
    int i, j;
    AAA(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i and j = " + i + " " + j);
    }
}

class BBB extends AAA{
    int k;

    BBB(int a, int b, int c){
        super(a, b);
        k = c;
    }

    void show(){
        super.show();
        System.out.println("K = " + k);
    }
}

public class MethodOverring2 {
    public static void main(String[] args) {
        BBB ob = new BBB(1, 2, 3);
        ob.show();
    }
}
