// Abstract class representing a vehicle
abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Abstract method for calculating the rental cost
    public abstract double calculateRentalCost(int numberOfDays);

    // Getters and setters for brand, model, and year

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Concrete class representing a car
class Car extends Vehicle {
    private int numberOfSeats;

    // Implementing the abstract method from the parent class
    // @Override
    public double calculateRentalCost(int numberOfDays) {
        // Calculate the rental cost based on the number of days and other factors
        // (implementation details omitted for brevity)
        return numberOfDays * 50.0;
    }

    // Getter and setter for numberOfSeats

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

// Concrete class representing a motorcycle
class Motorcycle extends Vehicle {
    private String type;

    // Implementing the abstract method from the parent class
    // @Override
    public double calculateRentalCost(int numberOfDays) {
        // Calculate the rental cost based on the number of days and other factors
        // (implementation details omitted for brevity)
        return numberOfDays * 30.0;
    }

    // Getter and setter for type

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

// Main class to demonstrate the abstraction

public class CarRentalSystem {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Camry");
        car.setYear(2020);
        car.setNumberOfSeats(5);

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand("Honda");
        motorcycle.setModel("CBR500R");
        motorcycle.setYear(2022);
        motorcycle.setType("Sport");

        int numberOfDays = 7;

        double carRentalCost = car.calculateRentalCost(numberOfDays);
        double motorcycleRentalCost = motorcycle.calculateRentalCost(numberOfDays);

        System.out.println("Car rental cost: $" + carRentalCost);
        System.out.println("Motorcycle rental cost: $" + motorcycleRentalCost);
    }
}
