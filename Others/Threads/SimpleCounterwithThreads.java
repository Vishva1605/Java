package Others.Threads;
class Count extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Count : "+i);
            try{Thread.sleep(1000);;}catch(InterruptedException e){};
        }
    }
}
public class SimpleCounterwithThreads {
    public static void main(String[] args) {
        new Count().start();
    }
}
