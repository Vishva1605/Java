class Vehicle{
    void sound(){
        System.out.println("generic vehicle sound");
    }
}
class Car extends Vehicle{
    @Override
    void sound(){
        System.out.println("Car goes Vroom vroom");
    }
}
class Bike extends Vehicle{
    @Override
    void sound(){
        System.out.println("Bike goes brap brap");
    }
}
public class VehicleSoundDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        // Car c1 = new Car();
        // Bike b1 = new Bike();
        // v1.sound();
        // c1.sound();
        // b1.sound();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();
        v1.sound();
        v2.sound();
        v3.sound();

        
    }
}
