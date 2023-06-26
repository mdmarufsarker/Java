package Interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 1, 10);

        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Speed is: " + mountainBike.speed);

        mountainBike.applyBrake(2);
        System.out.println("Speed after applying brake is: " + mountainBike.speed);

        mountainBike.speedUp(2);
        System.out.println("Speed after applying speedUp is: " + mountainBike.speed);

        mountainBike.canDrive();
        mountainBike.canRotateTwoWheels();
    }
}
// Gear is: 20
// Seat height is: 1
// Speed is: 10
// Speed after applying brake is: 8
// Speed after applying speedUp is: 10
// Mountain bike can drive.
// Two wheeler can rotate two wheels.