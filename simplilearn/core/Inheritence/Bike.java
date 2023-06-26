package Inheritence;

public class Bike extends Vehicle {

    public int noOfPassengers;
    
    public Bike(int price, int speed, String color, String model) {
        super(price, speed, color, model);
        this.noOfPassengers = 2;
    }
}
