package w3schools.Methods;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = factorial(5);
        System.out.println("Factorial of " + n + " is = " + result);
        sc.close();
    }
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
