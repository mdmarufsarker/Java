// Written by: Md. Maruf Sarker
// Platform: Linux
// Problem: Method Overloading
// Language: java
// Date: 2023-03-24
class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class Method {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2)); // prints 3
        System.out.println(calculator.add(1.5, 2.5)); // prints 4.0
        System.out.println(calculator.add(1, 2, 3)); // prints 6
    }
}
/*
In the example above, we have a class called "Calculator" with three "add" methods that have different parameter lists. The first "add" method takes two integers and returns their sum. The second "add" method takes two doubles and returns their sum. The third "add" method takes three integers and returns their sum.

In the "Main" class, we create an instance of "Calculator" and call each of the "add" methods with different arguments. Since the "add" methods have different parameter lists, Java knows which method to call based on the types and number of arguments passed in.

When we run the program, it will output the results of each of the "add" method calls. The first call will print 3, the second call will print 4.0, and the third call will print 6. This demonstrates how method overloading allows us to reuse method names while providing different behavior depending on the arguments passed in.
 */