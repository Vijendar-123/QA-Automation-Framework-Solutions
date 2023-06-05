package LMS_GettersSetters;

public class ModelX extends Car {

    boolean autoPilot = false;

    public void switchAutopilotOn() {
        autoPilot = true;
        System.out.println("Autopilot is switched on");
    }

    public void switchAutopilotOff() {
        autoPilot = false;
        System.out.println("Autopilot is switched off");
    }

    public String returnCarModel() {
        return "Car model is ModelX";
    }
}