package Others.Threads;
class Counter{
    private static int count = 0;
    static synchronized void increament(){
        count++;
    }
    public static int getCount() {
        return count;
    }
}
class MyThread1 extends Thread{
    // // Counter c;
    // MyThread1(Counter c){
    //     // this.c = c;
    // }
    public void run(){
        for(int i=0;i<1000;i++){
            Counter.increament();
        }
    }
}
public class SharedCounterIncreament {
    public static void main(String[] args) {
    //    Counter c = new Counter();

       MyThread1 m1 = new MyThread1();
       MyThread1 m2 = new MyThread1();

       m1.start();
       m2.start();

       try{m1.join();}catch(InterruptedException e){System.out.println("Intrerrupted Error");}
       try{m2.join();}catch(InterruptedException e){System.out.println("Interrupted Error");}

       System.out.println("Count : "+Counter.getCount());
    }   
}
