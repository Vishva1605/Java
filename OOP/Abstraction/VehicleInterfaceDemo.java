interface Vehicle{
    String start();
    default String fuelType(){
        return "Fuel Type : Petrol.";
    }
}
class Bike implements Vehicle{
    public String start(){
        return "Bike Starting...";
    }
}
public class VehicleInterfaceDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        System.out.println(v1.start());
        System.out.println(v1.fuelType());
    }
}
