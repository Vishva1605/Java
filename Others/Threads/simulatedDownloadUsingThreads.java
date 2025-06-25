package Others.Threads;
public class simulatedDownloadUsingThreads {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            System.out.println("Downloading...");
            String str = "==========";
            System.out.print("[");
            for(char ch : str.toCharArray()){
                System.out.print(ch);
                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println("Thread Interrupted");}
            }
            System.out.println("]");
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println("Thread Interrupted");}
            System.out.println("Download Complete.");
        };
        new Thread(r1).start();
    }
}
