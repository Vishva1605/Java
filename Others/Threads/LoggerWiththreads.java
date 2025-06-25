package Others.Threads;
class Logger{
    public synchronized void log(String msg){
        System.out.println(Thread.currentThread().getName()+" logs : "+msg);
        try{Thread.sleep(1000);}catch(InterruptedException e){Thread.currentThread().interrupt();};
    }
}
class Logwrker extends Thread{
    Logger logger;
    Logwrker(Logger logger,String name){
        super(name);
        this.logger = logger;
    }
    public void run(){
        for(int i=0;i<3;i++){
            logger.log("Log Message : "+i);
        }
    }
}
public class LoggerWiththreads {
    public static void main(String[] args) {
        Logger l = new Logger();

        Logwrker l1 = new Logwrker(l,"Ramesh");
        Logwrker l2 = new Logwrker(l,"Suresh");
        Logwrker l3 = new Logwrker(l,"Naina ");

        l1.start();
        l2.start();
        l3.start();

    }

}
