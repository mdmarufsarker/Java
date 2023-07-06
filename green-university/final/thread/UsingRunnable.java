class MyThread2 implements Runnable {
    public void run() {
        System.out.println("MyThread2 is running");
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        Thread thread = new Thread(t);
        thread.start();
    }
}
