package LMS_Inheritance;

public class Wrangler extends Car {

    boolean carDoors = true;

    public void takeOffDoors() {
        carDoors = false;
        System.out.println("Doors are taken off");
    }

    public void putBackDoors() {
        carDoors = true;
        System.out.println("Doors are back");

    }
}