// Written by: Md. Maruf Sarker
// Platform: Linux
// Problem: This keyword
// Language: java
// Date: 2023-03-24

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name; // using "this" to refer to the instance variable "name"
        this.age = age; // using "this" to refer to the instance variable "age"
    }

    public void printDetails() {
        System.out.println("Name: " + this.name); // using "this" to refer to the instance variable "name"
        System.out.println("Age: " + this.age); // using "this" to refer to the instance variable "age"
    }
}
public class This {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.printDetails();
        // Name: John
        // Age: 30
    }
}
/* 
In the example above, we have a class called "Person" that has two instance variables: "name" and "age". In the constructor, we use the "this" keyword to refer to the instance variables and initialize them with the values passed in as arguments.

In the "printDetails()" method, we use the "this" keyword to refer to the instance variables again and print their values. This is not strictly necessary in this case, as we could just refer to the variables by name, but it can be useful to make the code more explicit and avoid any potential confusion with local variables.

In the "main" method, we create a new instance of the "Person" class and call the "printDetails()" method to print out the person's name and age.
*/