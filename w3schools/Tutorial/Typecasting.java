package w3schools.Tutorial;

public class Typecasting {
    public static void main(Strings[] args) {
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        // Narrowing Casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2); // Outputs 9.78
        System.out.println(myInt2); // Outputs 9
    }
}