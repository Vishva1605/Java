package Others.Threads;
class Odd extends Thread{
    public void run(){
    for(int i=0;i<=10;i++){
        if(i%2!=0) System.out.println("Odd  : "+i);
        try{Thread.sleep(500);}catch(InterruptedException e){};
    }
}
}
class Even extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2==0) System.out.println("Even : "+i);
            try{Thread.sleep(500);}catch(InterruptedException e){};
        }
    }
}
public class EvenandOddPrinterWithThreads {
    public static void main(String[] args) {
        new Odd().start();
        try{Thread.sleep(1000);}catch(InterruptedException e){};
        new Even().start();
        try{Thread.sleep(1000);}catch(InterruptedException e){};
    }
}
