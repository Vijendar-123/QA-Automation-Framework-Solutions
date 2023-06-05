package LMS_GettersSetters;

public class Car {

    private int odometer = 0;
    private int productionYear = 0;

    public void setProductionYear(int year){
        productionYear = year;
    }
    
    public int getProductionYear (){
        return  productionYear;
    }

    public void drive( int miles) {
        System.out.println("Car drove " + miles + " miles");
        odometer = odometer + miles;
    }

    public String returnCarModel() {
        return "Car model is unknown";
    }
}