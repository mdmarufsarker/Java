package Interfaces;

class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
    public int gear;
    public int speed;
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        this.gear = gear;
        this.speed = speed;
        this.seatHeight = seatHeight;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return "gear: " + getGear() + " speed: " + getSpeed() + " seat height: " + getSeatHeight();
    }

    public void canDrive() {
        System.out.println("Mountain bike can drive.");
    }

    // setters
    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    // getters
    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
}
