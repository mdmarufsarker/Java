class a{
    void callme(){
        System.out.println("Inside a's callme function");
    }
}

class b extends a{
    void callme(){
        System.out.println("Inside b's callme function");
    }
}

class c extends b{
    void callme(){
        System.out.println("Inside c's callme function");
    }
}

public class DynamicMehtodDispatch {
    public static void main(String[] args) {
        a a = new a();
        b b = new b();
        c c = new c();
        
        a r; // obtain a reference of type a
        r = a; // r refers to an a object
        r.callme(); // calls a's version of callme

        r = b; // r refers to an b object
        r.callme(); // calls b's version of callme

        r = c; // r refers to an c object
        r.callme(); // calls c's version of callme
    }
}
