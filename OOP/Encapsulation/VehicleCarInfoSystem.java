package Encapsulation;
class Vehicle{
    private String brand;
    private int speed;
    public Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
    void displayVehicle(){
        System.out.print("Car_Brand : "+brand+" || Car_Speed : "+speed);
    }
}
class Car extends Vehicle{
    private String model;
    private String fueltype;
    public Car(String brand,int speed,String model,String fueltype){
        super(brand,speed);
        this.model = model;
        this.fueltype = fueltype;
    }
    void displayCar(){
        System.out.println(" || Car_Model : "+model+" || Car_FuelType : "+fueltype);
    }
}
public class VehicleCarInfoSystem {
    public static void main(String[] args) {
        Car c1 = new Car("Lambogini", 320, "L320", "Pertrol");
        Car c2 = new Car("Rolls_Royals",220,"R220","Petrol");
        Car c3 = new Car("Audi", 270, "A270", "Petrol");
        
        c1.displayVehicle();c1.displayCar();
        c2.displayVehicle();c2.displayCar();
        c3.displayVehicle();c3.displayCar();
    }
}
// 2. Vehicle-Car Info
// Parent Class: Vehicle with brand and speed.

// Child Class: Car with model and fuelType.

// Task: Display full car information using inheritance.