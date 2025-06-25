package Others.Threads;
class Countdown extends Thread{
    public void run(){
        System.out.println("Countdown Starts ...");
        for(int i=5;i>=1;i--){
            System.out.println(i);
            try{Thread.sleep(1000);}catch(InterruptedException e){};
        }
    }
}
public class ThreadwithCountdownPlusjoin {
    public static void main(String[] args) {
        Countdown c = new Countdown();
        c.start();
        try{c.join();System.out.println("Done");}catch(InterruptedException e){};
    }
}
