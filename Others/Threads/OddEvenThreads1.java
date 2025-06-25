package Others.Threads;
class Separator{
    private int max;
    private int number = 1;
    private Boolean isOdd = true;
    Separator(int max){
        this.max = max;
    }
    public synchronized void checkOdd(){
        while(number<max){
            while(!isOdd){
                try{wait();}catch(InterruptedException e){Thread.currentThread().interrupt();};
            }
            System.out.println(Thread.currentThread().getName()+"  : "+number);
            isOdd = false;
            number++;
            notify();
        }
    }
    public synchronized void checkEven(){
        while(number<=max){
            while(isOdd){
                try{wait();}catch(InterruptedException e){Thread.currentThread().interrupt();}
            }
            System.out.println(Thread.currentThread().getName()+" : "+number);
            isOdd = true;
            number++;
            notify();
        }
    }
}
class OddThread extends Thread{
    Separator separator;
    OddThread(Separator separator){
        super("Odd");
        this.separator = separator;
    }
    public void run(){
        separator.checkOdd();
    }
}
class EvenThread extends Thread{
    Separator separator;
    EvenThread(Separator separator){
        super("Even");
        this.separator = separator;
    }
    public void run(){
        separator.checkEven();
    }
}
public class OddEvenThreads1 {
    public static void main(String[] args) {
        int max = 10;
        Separator s = new Separator(max);

        new OddThread(s).start();
        new EvenThread(s).start();
    }
}
