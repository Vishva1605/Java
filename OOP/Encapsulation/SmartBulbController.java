package Encapsulation;
class SmartBulb{
    private boolean ison;
    private int brightness;

    public SmartBulb(int brightness){
        this.ison = false;
        this.brightness = brightness;
    }

    public int getBrightness(){
        return brightness;
    }
    public boolean getIsOn(){
        return ison;
    }

    public void turnOn(){
        if(!getIsOn()){
            ison = true;
            System.out.println("Smart Bulb is On");
        }else{
            System.out.println("Smart bulb is Already On");
        }
        System.out.println();
    }
    public void turnOff(){
        if(getIsOn()){
            ison = false;
            System.out.println("Smart Bulb is Off");
        }else{
            System.out.println("Smart Bulb is Already Off");
        }
        System.out.println();
    }
    public void increasebrightness(int amount){
        if(ison){
            brightness += amount;
            if(brightness>=0 && brightness<=100)
                System.out.println("Brightness Increased by : "+amount);
        }
        else
            System.out.println("Invalid brightness");
        System.out.println();
    }
    public void getstatus(){
        if(ison){
            System.out.println("Bulb is On");
        }else{
            System.out.println("Bulb is Off");
        }
        System.out.println("Brightness level : "+brightness);
    }

}
public class SmartBulbController {
    public static void main(String[] args) {
        SmartBulb sb = new SmartBulb(50);

        sb.turnOn();
        // sb.turnOff();
        sb.increasebrightness(40);
        sb.getstatus();
    }
}
