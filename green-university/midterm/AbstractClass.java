// In Java, an abstract class is a class that cannot be instantiated on its own but serves as a blueprint for other classes. It may contain both abstract and non-abstract methods, as well as instance variables and constructors.

abstract class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void makeSound();
    
    public void printName() {
        System.out.println("Name: " + name);
    }
}
/* 
In this example, the Animal class is marked as abstract and contains an instance variable name, a constructor that initializes the name variable, an abstract method makeSound(), and a non-abstract method printName().

The makeSound() method is marked as abstract and does not have an implementation in the Animal class. Any class that extends the Animal class will be required to provide an implementation for the makeSound() method.

Here's an example of a class that extends the Animal class and provides an implementation for the makeSound() method:
*/

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public void makeSound() {
        System.out.println("Woof!");
    }
}
/* 
In this example, the Dog class extends the Animal class and provides an implementation for the makeSound() method. When the makeSound() method is called on an instance of the Dog class, it will print "Woof!" to the console.

Note that because the Animal class is abstract, it cannot be instantiated on its own. Instead, it serves as a blueprint for other classes to extend and implement its abstract methods.
*/
public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido");
        dog.printName(); // Name: Fido
        dog.makeSound(); // Woof!
    }
}
