package Others.Others;
class Device{
    final void powerOn(){
        System.out.println("Device is On");
    }
}
final class Phone extends Device{
    final void makeCall(){
        System.out.println("Phone is Calling");
    }
}
final class Laptop extends Device{
    final void compileCode(){
        System.out.println("Laptop Compiles code");
    }
}
final public class UpcastingDowncasting {
    public static void main(String[] args) {
        Device d1 = new Phone();
        d1.powerOn();
        Phone p1 = (Phone)d1;
        p1.makeCall();
        Device d2 = new Laptop();
        d2.powerOn();
        Laptop l1 = (Laptop)d2;
        l1.compileCode();
    }
}
