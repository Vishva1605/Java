interface Printable{
    String print();
}
interface Scannable{
    String scan();
}
class MultiFunctionPrinter implements Printable,Scannable{
    public String print(){
        return "Printing Document...";
    }
    public String scan(){
        return "Scanning Document...";
    }
}

public class MultiFunctionPrinterDemo {
    public static void main(String[] args) {
        MultiFunctionPrinter m1 = new MultiFunctionPrinter();
        System.out.println(m1.print());
        System.out.println(m1.scan());
    }
}
