package Slide11;
public class Car {
    private int odometer = 0;
    public void drive (int miles){
        odometer = odometer + miles;
        System.out.println("car drove " + odometer + " miles");

    }
    public String returnCarModel(){
        return "car model is unknown";
    }
}

