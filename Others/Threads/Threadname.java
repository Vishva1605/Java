package Others.Threads;
class F extends Thread {
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
    }
}

public class Threadname {
    public static void main(String[] args) {
        F t1 = new F();
        F t2 = new F();

        t1.setName("Ravi");
        t2.setName("Sanjai");

        t1.start();
        t2.start();
    }
}
