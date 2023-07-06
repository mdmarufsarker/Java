class Addition extends Thread {
    private String name;
    private int a;
    private int b;

    Addition(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(name + " = " + (a + b));
    }
}
class Subtraction extends Thread {
    private String name;
    private int a;
    private int b;

    Subtraction(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(name + " = " + (a - b));
    }
}
class Multiplication extends Thread {
    private String name;
    private int a;
    private int b;

    Multiplication(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(name + " = " + (a * b));
    }
}
class Division extends Thread {
    private String name;
    private int a;
    private int b;

    Division(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(name + " = " + (a / b));
    }
}
class Modulas extends Thread {
    private String name;
    private int a;
    private int b;

    Modulas(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println(name + " = " + (a % b));
    }
}

public class Calculator {
    public static void main(String[] args) {
        Addition t1 = new Addition("Addition", 10, 5);
        Subtraction t2 = new Subtraction("Subtraction", 10, 5);
        Multiplication t3 = new Multiplication("Multiplication", 10, 5);
        Division t4 = new Division("Division", 10, 5);
        Modulas t5 = new Modulas("Modulas", 10, 5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
