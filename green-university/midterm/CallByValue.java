// Written by: Md. Maruf Sarker
// Platform: Linux Mint 19.3
// Problem: Call by Value
// Language: java
// Date: 2023-03-24

public class CallByValue {
    public static void changeValue(int a) {
        a = 20;
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling method: " + x);
        changeValue(x);
        System.out.println("After calling method: " + x);

        // Before calling method: 10
        // After calling method: 10
    }
}
/*
In the example above, we have a method called "changeValue" that takes an integer parameter "a" and sets its value to 20. In the "main" method of the "Main" class, we declare an integer variable "x" and set its value to 10. We then call the "changeValue" method with "x" as the argument, but the value of "x" remains 10 because it was passed by value to the method.
 */