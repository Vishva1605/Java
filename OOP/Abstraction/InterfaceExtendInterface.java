interface Readable{
    String read();
}
interface Writable extends Readable{
    String write();
}
class Document implements Writable{
    public String read(){
        return "Reading Document...";
    }
    public String write(){
        return "Writing Document...";
    }
}
public class InterfaceExtendInterface {
    public static void main(String[] args) {
        Document d = new Document();
        System.out.println(d.read()+"\n"+d.write());
    }
}
