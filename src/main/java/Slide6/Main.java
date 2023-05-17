package Slide6;

import Slide7.Car;

public class Main {
    public static void main(String[] args) {

        Wrangler car = new Wrangler();

        car.drive(5);
        car.drive(5);
        car.takeOffDoors();
        car.putBackDoors();

        ModelX car2 = new ModelX();

        car2.drive(5);
        car2.drive(5);
        car2.switchAutoPilotOn();
        car2.switchAutoPilotOff();



    }
}
