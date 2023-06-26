package w3schools.Tutorial;

import java.util.Scanner;

public class InputOutput {
    public static void main(Strings[] args) {
        // Way-1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

        // Way-2
        // try(Scanner input = new Scanner(System.in)) {
        //     System.out.println("Enter your name: ");
        //     String name = input.nextLine();
        //     System.out.println("Your name is: " + name);
        // }
    }
}
