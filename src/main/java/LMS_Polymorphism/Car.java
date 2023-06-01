package LMS_Polymorphism;

public class Car {

    int odometer = 0;

    public void drive( int miles) {
        System.out.println("Car drove " + miles + " miles");
        odometer = odometer + miles;
    }

    public String returnCarModel() {
        return "Car model is unknown";
    }
}