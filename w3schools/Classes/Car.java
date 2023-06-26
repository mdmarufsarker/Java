package w3schools.Classes;

public class Car {
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) {
        Car myObj = new Car();
        myObj.fullThrottle();
        myObj.speed(200);
    }
}
