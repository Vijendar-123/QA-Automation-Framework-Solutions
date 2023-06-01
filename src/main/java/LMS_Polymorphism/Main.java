package LMS_Polymorphism;

public class Main {

    public static void main(String[] args) {

        Wrangler myWranglerCar = new Wrangler();
        myWranglerCar.drive( 100);
        System.out.println("Wrangler odometer displays " +myWranglerCar.odometer+ " miles");
        myWranglerCar.takeOffDoors();
        System.out.println(myWranglerCar.returnCarModel());

        ModelX myModelXCar = new ModelX();
        myModelXCar.drive( 90);
        System.out.println("ModelX odometer displays " +myModelXCar.odometer+ " miles");
        myModelXCar.switchAutopilotOn();
        System.out.println(myModelXCar.returnCarModel());

        Car myCar = new Car();
        myCar.drive(50);
        System.out.println(myCar.returnCarModel());
    }
}