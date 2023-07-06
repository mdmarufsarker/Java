class Vehicle {
    private String name;
    private String model;

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void start() {
        System.out.println("The " + name + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println("The " + name + " " + model + " is stopping.");
    }

    public void accelerate() {
        System.out.println("The " + name + " " + model + " is accelerating.");
    }

    // getters
    public String getname() {
        return name;
    }

    public String getModel() {
        return model;
    }
}


class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String name, String model, int numberOfDoors) {
        super(name, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("Opening " + numberOfDoors + " doors of the trunk " + getname() + " " + getModel() + " car.");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Brand", "Model");
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();

        System.out.println();

        Car car = new Car("Honda", "Civic", 4);
        car.start();
        car.accelerate();
        car.stop();
        car.openTrunk();
    }
}
