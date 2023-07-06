class A implements Runnable{
    private String name;

    public A(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("A");
        for(int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

class B implements Runnable{
    private String name;

    public B(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("B");
        for(int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class SameThreadMultipleClass {
    public static void main(String[] args) {
        A t1 = new A("T1");
        B t2 = new B("T2");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
