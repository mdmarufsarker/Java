abstract class m{
    abstract void callme();

    // concrete method are still allowed to abstract classes
    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}

class n extends m{
    void callme(){
        System.out.println("n's implementation of callme");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        n n = new n();

        n.callme();
        n.callmetoo();
    }
}
