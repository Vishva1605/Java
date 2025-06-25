package Others.Threads;
class Mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello from Thread.");
            try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("Error");}
        }
    }
}
public class helothread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
    }
}
