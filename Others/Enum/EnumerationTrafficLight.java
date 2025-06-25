package Others.Enum;
import java.util.Scanner;
enum Trafficlight{
    RED,YELLOW,GREEN;
}
public class EnumerationTrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Signal(RED,YELLOW,GREEN): ");
        String signal = sc.nextLine();
        Trafficlight t = Trafficlight.valueOf(signal);
        try{
            if(t == Trafficlight.RED){
                System.out.println("Sto for 30 seconds");
            }else if(t == Trafficlight.YELLOW){
                System.out.println("Stop for 45 seconds");
            }else{
                System.out.println("go! for 60 seconds");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
