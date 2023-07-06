class MyThread1 extends Thread {
    public void run() {
        System.out.println("MyThread1 running");
    }
}

public class UsingThread {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
    }
}