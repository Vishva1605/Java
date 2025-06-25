abstract class Vehicle{
    abstract void move();
}
class Bike extends Vehicle{
    void move(){
        System.out.println("Bike is moving on the road");
    }
}
class Car extends Vehicle{
    void move(){
        System.out.println("Car is moving on the road");
    }
}
public class VehicleMoveAbstractDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        v1.move();v2.move();
    }
}
