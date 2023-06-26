// In Java, the super keyword is used to refer to the superclass of the current object, and can be used to access its members, including its constructors, instance variables, and methods.

class Animal {
    private String species;
    protected int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }
}
class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The " + breed + " is barking.");
    }

    @java.lang.Override
    public void eat() {
        super.eat();
        System.out.println("The " + breed + " is also eating.");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 2, "Labrador");
        dog.bark(); // prints "The Labrador is barking."
        dog.eat(); // prints "The Dog is eating." and "The Labrador is also eating."
    }
}
/*
In this example, we have an Animal class with two instance variables (species and age) and a method eat(). We then have a Dog class that extends Animal and adds a new instance variable (breed) and a method bark().

The Dog class also overrides the eat() method from Animal with its own implementation, which calls super.eat() to invoke the eat() method of the superclass and then adds its own implementation to print out "The Labrador is also eating."

In the Dog constructor, super(species, age) is called to invoke the constructor of the Animal superclass with the species and age arguments passed in. This is necessary because Animal does not have a default constructor.

In the main() method, we create a Dog object and call its bark() and eat() methods. The eat() method call in Dog first calls the eat() method of the Animal superclass using super.eat(), and then adds its own implementation to print out "The Labrador is also eating."
 */