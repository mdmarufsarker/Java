package w3schools.Methods;

import java.util.Scanner;

public class Calculator {
    private static double sum(double n1, double n2) {
        return n1 + n2;
    }
    private static double sub(double n1, double n2) {
        return n1 - n2;
    }
    private static double prod(double n1, double n2) {
        return n1 * n2;
    }
    private static double div(double n1, double n2) {
        return n1 / n2;
    }
    private static double mod(double n1, double n2) {
        return n1 % n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2;

        System.out.print("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("Summation: " + sum(n1, n2));
        System.out.println("Subtraction: " + sub(n1, n2));
        System.out.println("Multiplication: " + prod(n1, n2));
        System.out.println("Division: " + div(n1, n2));
        // print two decimal places
        System.out.println("Division: " + String.format("%.2f", div(n1, n2)));
        System.out.println("Modulus: " + (int)mod(n1, n2));

        sc.close();
    }
}
