package Others.Threads;
class Msg extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try{Thread.sleep(2000);}catch(InterruptedException e){};
        }
    }
}
public class MultipleMessagesWithThreads {
    public static void main(String[] args) {
        Msg m1 = new Msg();
        Msg m2 = new Msg();
        Msg m3 = new Msg();

        m1.setName("Good Morning");
        m2.setName("Hello");
        m3.setName("Welcome");

        m1.start();
        try{Thread.sleep(500);}catch(InterruptedException e){};
        m2.start();
        try{Thread.sleep(500);}catch(InterruptedException e){};
        m3.start();
        try{Thread.sleep(500);}catch(InterruptedException e){};
    }
}
