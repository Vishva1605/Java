package Others.Threads;
class Name extends Thread{
    private String name;
    Name(String name){
        this.name = name;
    }
    public void run(){
        int i=1;
        while(i<=3){
            System.out.println("Name : "+name+" || Iteration : "+i);
            i++;
        }
    }
}
public class priorityShowdown {
    public static void main(String[] args) {
        Name n1 = new Name("Ravi");
        Name n2 = new Name("Sanjai");
        Name n3 = new Name("Retti");

        n1.setPriority(Thread.MIN_PRIORITY);
        n2.setPriority(Thread.NORM_PRIORITY);
        n3.setPriority(Thread.MIN_PRIORITY);

        n1.start();
        n2.start();
        n3.start();
    }
}
