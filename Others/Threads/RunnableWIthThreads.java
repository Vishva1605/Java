package Others.Threads;
public class RunnableWIthThreads {
    public static void main(String[] args) {
        Runnable r1 = () ->{
            for(int i=0;i<5;i++){
                System.out.println("Runnable is running...");
                try{Thread.sleep(500);}catch(InterruptedException e){};
            }
        };
        new Thread(r1).start();
    }
}
