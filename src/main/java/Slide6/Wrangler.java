package Slide6;

public class Wrangler {
    boolean carDoors = true;
    int odometer = 0;

    public void drive(int miles) {
        odometer = odometer + miles;
        System.out.println("car drove " + odometer + " miles");
    }
    public void takeOffDoors () {
         carDoors = false;
         System.out.println("Doors are taken off");
        }
    public void putBackDoors () {
         carDoors = true;
         System.out.println("Doors are back");
        }
    }



