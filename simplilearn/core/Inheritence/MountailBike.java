package Inheritence;

public class MountailBike {
    public static void main(String[] args) {
        Bike b = new Bike(1000, 200, "Red", "Honda");
        System.out.println(b.display());

        System.out.println(b.noOfPassengers); // 2
    }
}
