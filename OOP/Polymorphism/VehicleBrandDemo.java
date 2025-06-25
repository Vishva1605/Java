class Vehicle{
    protected String brand;
    Vehicle(){
        this.brand = "Generic";
    }
    void showBrand(){
        System.out.println("Brand : "+brand);
    }
}
class Car extends Vehicle{
    Car(){
        super();
        brand = "Toyota";
    }
    @Override
    void showBrand(){
        System.out.println("Brand : "+super.brand);
    }

}
public class VehicleBrandDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.showBrand();
    }
}
