package Others.Threads;
class Separator{
    public synchronized void separate(int num){
        try{Thread.sleep(200);}catch(InterruptedException e){System.out.println("Interrupted Error");};
        if(num%2==0){
            System.out.println("Even : "+num);
        }else{
            System.out.println("Odd  : "+num);
        }
    }
}
class MyThread extends Thread{
    private Separator separator;
    MyThread(Separator separator){
        this.separator = separator;
    }
    public void run(){
    for(int i=1;i<=10;i++){
        separator.separate(i);
    }
}
}
public class OddEvenThreads {
    public static void main(String[] args) {
        Separator s = new Separator();
        new MyThread(s).start();
    }
}
