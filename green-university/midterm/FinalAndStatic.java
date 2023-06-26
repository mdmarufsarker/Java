// Written by: Md. Maruf Sarker
// Platform: 
// Problem: 
// Language: java
// Date: 2023-03-24
// Difficulty Rating: 

// In Java, "final" and "static" are keywords used to define class members.

class MyFinalClass {
    final int x = 10;
    final void doSomething() {
        // some code here
    }
}

class MyStaticClass {
    static int x = 10;
    static void doSomething() {
        // some code here
    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
        // This will result in a compile-time error, as we cannot override a final method
        void doSomething() {
            // some other code here
        }
        /*
         In the example above, we have a class called "MyClass" with an instance variable "x" and a method "doSomething", both declared as final. We then have a subclass called "MySubClass" that tries to override the "doSomething" method, but this will result in a compile-time error.
         */

        
        System.out.println(MyStaticClass.x); // prints 10
        MyStaticClass.doSomething(); // calls the static method
        /*
        In the example above, we have a class called "MyClass" with a static variable "x" and a static method "doSomething". We can access the static variable and method using the class name itself, rather than creating an instance of the class. In the "main" method of the "Main" class, we print the value of the static variable and call the static method using the class name "MyClass".
         */
    }
}