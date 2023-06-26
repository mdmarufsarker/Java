package Inheritence;

public class Vehicle {
    protected int price;
    protected int speed;
    protected String color;
    protected String model;

    public Vehicle(int price, int speed, String color, String model) {
        this.price = price;
        this.speed = speed;
        this.color = color;
        this.model = model;
    }

    public String display() {
        return "Price: " + price + " Speed: " + speed + " Color: " + color + " Model: " + model;
    }

    public static void main(String[] args) {
        // Vehicle v = new Vehicle(1000, 200, "Red", "Honda");
        // System.out.println(v.display());
    }
}
