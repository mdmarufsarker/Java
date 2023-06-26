class Animals {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dogs extends Animals {
    @java.lang.Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
public class Override {
    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.makeSound(); // prints "Animal makes a sound."

        Dogs dog = new Dogs();
        dog.makeSound(); // prints "Dog barks."
    }
}
/*
In this example, we have a superclass Animals with a makeSound() method that prints out "Animal makes a sound." We then have a subclass Dog that overrides the makeSound() method to print out "Dog barks."

By using the @Override annotation in the Dogs class, we indicate that the makeSound() method is intended to override the method with the same name and signature in the Animal superclass. This helps to ensure correctness and improve readability.
 */