package LMS_Inheritance;
public class Main {

    public static void main(String[] args) {

        Wrangler myWranglerCar = new Wrangler();
        myWranglerCar.drive( 100);
        System.out.println("Wrangler odometer displays " +myWranglerCar.odometer+ " miles");
        myWranglerCar.takeOffDoors();

        ModelX myModelXCar = new ModelX();
        myModelXCar.drive( 90);
        System.out.println("ModelX odometer displays " +myModelXCar.odometer+ " miles");
        myModelXCar.switchAutopilotOn();

        Car myCar = new Car();
        myCar.drive(50);

    }
}