package LMS_GettersSetters;

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
    public String returnCarModel() {
        return "Car model is Wrangler";
    }
}