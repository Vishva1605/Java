package Others.Others;
import java.time.LocalTime;

class Clock{
    void displayTime(){
        class Time{
            void time(){
                System.out.println(LocalTime.now());
            }
        }
        Time t1 = new Time();
        t1.time();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.displayTime();
    }
}
