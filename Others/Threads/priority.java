package Others.Threads;
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("count1 : "+i);
            try{Thread.sleep(1000);}catch(InterruptedException e){};
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("count2 : "+i);
            try{Thread.sleep(1000);}catch(InterruptedException e){};
        }
    }
}
public class priority {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        
    }
}
