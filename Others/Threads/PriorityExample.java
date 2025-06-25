package Others.Threads;
class Demo extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();
        Demo t3 = new Demo();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
