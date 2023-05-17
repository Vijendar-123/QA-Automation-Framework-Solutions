package Slide6;
public class ModelX {
    int odometer = 0;
    boolean autoPilot = false;
    public void drive(int miles) {
        odometer = odometer + miles;
        System.out.println("car drove " + odometer + " miles");
    }
    public  void switchAutoPilotOn(){
        autoPilot = true;
        System.out.println("Autopilot is switched on");
    }
    public  void switchAutoPilotOff(){
        autoPilot = false;
        System.out.println("Autopilot is switched off");
    }
}

