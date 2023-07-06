class DemoClass1 extends Thread {
    private String name;

    public DemoClass1(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("DemoClass1");
        for(int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class SameClassMultipleThread {
    public static void main(String[] args) {
        DemoClass1 t1 = new DemoClass1("T1");
        DemoClass1 t2 = new DemoClass1("T2");
        t1.start();
        t2.start();
    }
}
