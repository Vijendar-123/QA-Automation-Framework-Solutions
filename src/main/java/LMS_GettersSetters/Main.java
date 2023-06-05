package LMS_GettersSetters;

public class Main {

    public static void main(String[] args) {

        Wrangler myWranglerCar = new Wrangler();
        myWranglerCar.drive( 100);
        myWranglerCar.takeOffDoors();
        System.out.println(myWranglerCar.returnCarModel());
        myWranglerCar.setProductionYear(2022);
        System.out.println(myWranglerCar.getProductionYear());

        ModelX myModelXCar = new ModelX();
        myModelXCar.drive( 90);
        myModelXCar.switchAutopilotOn();
        System.out.println(myModelXCar.returnCarModel());
        myModelXCar.setProductionYear(2021);
        System.out.println(myModelXCar.getProductionYear());

        Car myCar = new Car();
        myCar.drive(50);
        System.out.println(myCar.returnCarModel());
    }
}