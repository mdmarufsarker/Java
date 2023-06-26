package w3schools.Methods;

import java.time.Year;

public class ParaArg {
    static int calcAge(int age){
        Year year = Year.now();
        return year.getValue() - age;
    }
    static void welcomeMsg(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void main(String[] args) {
        welcomeMsg("Maruf Sarker");
        System.out.println("Your are " + calcAge(1999) + " years old.");
    }
}
