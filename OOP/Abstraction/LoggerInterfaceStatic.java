interface Logger{
    String log(String msg);
    static String printHeader(){
        return "---LOG START---";
    }
}
class AppLogger implements Logger{
    public String log(String msg){
        return msg;
    }
}
public class LoggerInterfaceStatic {
    public static void main(String[] args) {
        AppLogger a = new AppLogger();
        System.out.println(Logger.printHeader());
        System.out.println(a.log("INFO: Application started successfully."));
    }
}
