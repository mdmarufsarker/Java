package projects.Calculator;

import java.util.Scanner;

public class ReadInput {
    public static String read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your expression: ");
        String expression = sc.nextLine();

        sc.close();
        return expression;
    }
}
