package w3schools.Classes;

public class Methods {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); // error: non-static method myPublicMethod() cannot be referenced from a static context

        Methods myObj = new Methods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

        // Static methods can be called without creating objects
        // Public methods must be called by creating objects
    }
}
