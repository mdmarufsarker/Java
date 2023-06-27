// returning an object
class T{
    int a;

    T(int i){
        a = i;
    }

    T incrByTen(){
        T tmp = new T(a + 10);
        return tmp;
    }
}

public class ReturnObject{
    public static void main(String[] args) {
        T ob1 = new T(2);
        T ob2;

        ob2 = ob1.incrByTen();
        System.out.println("Ob1.a = " + ob1.a);
        System.out.println("Ob2.a = " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("Ob2.a after 2nd increase = " + ob2.a);
    }
}