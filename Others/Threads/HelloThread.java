package Others.Threads;
class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello from A.");
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println("Error");}
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello from B.");
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println("Error");}
        }
    }
}
public class HelloThread {
    public static void main(String[] args) {
       A t1 = new A();
       B t2 = new B();
       t1.start();
       try {t1.join();System.out.println("FINISHED A");} catch (InterruptedException e) {System.out.println("Error");} 
       System.out.println();   
       try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Error");}
       t2.start();
       try {t2.join();System.out.println("FINISHED B");} catch (InterruptedException e) {System.out.println("Error");} 
    }
}
