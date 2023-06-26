package w3schools.Classes;

// A static method means that it can be accessed without creating an object of the class, unlike public:

public class Static {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    // Public methods must be called by creating objects
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); // This would generate an error
        Static myObj = new Static(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
