package Slide7;

public class Wrangler {

    boolean carDoors = true;

    public void takeOffDoors(){
        carDoors = false;
        System.out.println("Doors are taken off");
    }

    public void putBackDoors(){
        carDoors = true;
        System.out.println("Doors are back");
    }
}
