package w3schools.Methods;

import java.time.Year;
import java.util.Scanner;

public class CalcAge {
    public static Scanner sc = new Scanner(System.in);
    static String userName() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        return name;
    }
    static int calcAge() {
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = sc.nextInt();

        Year currentYear = Year.now();
        return currentYear.getValue() - yearOfBirth;
    }
    public static void main(String[] args) {
        System.out.println("Hello, " + userName() + ". Your age is: " + calcAge());
    }
}
