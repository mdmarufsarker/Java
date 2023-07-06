/*
 * Writer: Md. Maruf Sarker
 * University: Green University of Bangladesh
 * Department: CSE (2nd year)
 * GitHub: https://github.com/mdmarufsarker
 */

import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Arithmetic{
    int a = 5;
    int b = 0;

    public void divide() {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}

class ArrayIndex{
    int[] arr = new int[5];

    public void access() {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}

class NullPointer{
    String str = null;

    public void access() {
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}

class NumberFormat{
    String str = "abc";

    public void convert() {
        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}

class StringIndex{
    String str = "abc";

    public void access() {
        try {
            System.out.println(str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}

class IllegalArgument{
    String str = "abc";

    public void convert() {
        try {
            int num = Integer.parseInt(str);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }
}


class AllExceptions{
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        a.divide();

        ArrayIndex b = new ArrayIndex();
        b.access();

        NullPointer c = new NullPointer();
        c.access();

        NumberFormat d = new NumberFormat();
        d.convert();

        StringIndex e = new StringIndex();
        e.access();

        IllegalArgument h = new IllegalArgument();
        h.convert();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if(age < 18){
                throw new CustomException("You are not eligible to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (CustomException err) {
            System.out.println(err.getMessage());
        }
    }
}