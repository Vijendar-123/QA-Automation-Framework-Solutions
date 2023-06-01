package LMS_Inheritance;

public class Car {

    int odometer = 0;

    public void drive( int miles) {
        System.out.println("Car drove " + miles + " miles");
        odometer = odometer + miles;
    }
}