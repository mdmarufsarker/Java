// package Interface;

// way - 1

public class TestIface1 {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        // c.nonIfacemeth();
        // An interface reference variable has knowledge only of the methods declared by its interface declaration.
    }
}
