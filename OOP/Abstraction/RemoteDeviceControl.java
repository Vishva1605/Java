interface Remote{
    String pressButton();
}
class TV implements Remote{
    public String pressButton(){
        return "TV is On";
    }
}
class AC implements Remote{
    public String pressButton(){
        return "AC is On";
    }
}
public class RemoteDeviceControl {
    public static void main(String[] args) {
        Remote r1 = new TV();
        Remote r2 = new AC();
        System.out.println(r1.pressButton());
        System.out.println(r2.pressButton());
    }
}
