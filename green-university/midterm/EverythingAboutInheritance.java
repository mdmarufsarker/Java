class Vehicle {
    protected String make;
    protected String model;
    
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public void start() {
        System.out.println("Starting the vehicle...");
    }
}

class Car extends Vehicle {
    private int numDoors;
    
    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }
    
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }
}

public class EverythingAboutInheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", "Camry");
        Car c = new Car("Honda", "Accord", 4);
        
        v.start(); // prints "Starting the vehicle..."
        c.start(); // prints "Starting the car..."
    }
}
/*
In the example above, we have a superclass called "Vehicle" that has two instance variables "make" and "model" and a method called "start". We then have a subclass called "Car" that extends "Vehicle" and adds a new instance variable "numDoors". The "Car" class also overrides the "start" method from the "Vehicle" class with its own implementation. Finally, in the "main" method of the "Main" class, we create instances of both "Vehicle" and "Car" and call their "start" methods, which invoke the appropriate implementation based on the object's class.
 */