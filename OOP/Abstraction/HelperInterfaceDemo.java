interface Helper{
    String help();
    static String greet(){
        return "Welcome!";
    }
}
class Assistant implements Helper{
    public String help(){
        return "How can I assist You?";
    }
}
public class HelperInterfaceDemo {
    public static void main(String[] args) {
        Helper h1 = new Assistant();
        System.out.println(Helper.greet());
        System.out.println(h1.help());
    }
}
