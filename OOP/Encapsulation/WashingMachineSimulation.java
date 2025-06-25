package Encapsulation;
class Appliance{
    private String brand;
    private String power;
    public Appliance(String brand,String power){
        this.brand = brand;
        this.power = power;
    }
    public String getBrand() {
        return brand;
    }
    public String getPower() {
        return power;
    }
}
class WashingMachine extends Appliance{
    private String drumsize;
    private String mode;
    public WashingMachine(String brand,String power,String drumsize,String mode){
        super(brand, power);
        this.drumsize = drumsize;
        this.mode = mode;
    }
    void showDetails(){
        System.out.println("\tWashing Machine Details");
        System.out.println("-----------------------------------------");
        System.out.println("Brand    : "+getBrand());
        System.out.println("Power    : "+getPower());
        System.out.println("DrumSize : "+drumsize);
        System.out.println("Mode     : "+mode);
        System.out.println("-----------------------------------------");
    }
    void startWash(){
        System.out.println("Washing Started....");
    }
}
public class WashingMachineSimulation {
    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine("Tesla", "30v", "15L","Automatic");
        w1.showDetails();
        w1.startWash();
    }
}
// 9. Appliance-WashingMachine
// Parent Class: Appliance with brand, power.

// Child Class: WashingMachine with drumSize and mode.

// Task: Show details and simulate startWash() method.
