package Exceptions;

public class Demo {
    public static void main(String[] args) {
        // runtime exceptions
        int data = 100 / 0;
        System.out.println(data);

        String s = null;
        System.out.println(s.length());
        System.out.println(s.charAt(0));
    }
}
