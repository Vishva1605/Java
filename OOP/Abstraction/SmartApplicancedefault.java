interface SmartApplicance{
    String trunOn();
    default String connectWifi(){
        return "Connected to Wifi...";
    }
}
class Smartfan implements SmartApplicance{
    public String connectWifi(){
        return "Connected to Wifi...";
    }
    @Override
    public String trunOn() {
        return "Fan is turned On";
    }
}
public class SmartApplicancedefault {
    public static void main(String[] args) {
        Smartfan s = new Smartfan();
        System.out.println(s.trunOn());
        System.out.println(s.connectWifi());
    }
}
