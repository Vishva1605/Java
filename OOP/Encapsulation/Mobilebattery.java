package Encapsulation;
class Mobile{
    private int batterylevel;

    public Mobile(int batterylevel){
        this.batterylevel = batterylevel;
    }
    //getters
    public int getBatteryLevel(){
        return batterylevel;
    }
    //methods
    void charge(int percent){
        batterylevel += percent;
        if(batterylevel<100){
            System.out.println("Mobile charge : "+batterylevel);
        }else{
            batterylevel = 100;
            System.out.println("Mobile charge (Full) : "+batterylevel);
        }
    }
    void use(int percent){
        batterylevel -= percent;
        if(batterylevel>0){
            System.out.println("Mobile charge : "+batterylevel);
        }else{
            batterylevel = 0;
            System.out.println("Mobile charge (drained) : "+batterylevel);
        }
    }
    void remainingbattery(){
        System.out.println("Mobile Charge : "+batterylevel);
    }
}
//main
public class Mobilebattery {
    public static void main(String[] args) {
        Mobile m1 = new Mobile(50);
        m1.charge(44);
        m1.use(72);
        m1.remainingbattery();
    }
}
