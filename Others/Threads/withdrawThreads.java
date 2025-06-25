package Others.Threads;
class Bank{
    private int balance;
    Bank(int balance){
        this.balance = balance;
    }
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" Wants to Withdraw Rs."+amount+" || Balance : "+balance);
        if(amount<0 || amount>balance){
            System.out.println("Insufficient Balance / Negative Amount");
        }else{
            balance-=amount;
            System.out.println("Withdrawl Successfull");
        }
    }
}
class WithdrawThread extends Thread{
    private Bank balance;
    private int amount;
    WithdrawThread(Bank balance,String name,int amount){
        super(name);
        this.balance = balance;
        this.amount = amount;
    }
    public void run(){
        balance.withdraw(amount);
    }
}
public class withdrawThreads {
    public static void main(String[] args) {
        Bank b = new Bank(50000);
        
        WithdrawThread t1 = new WithdrawThread(b,"Vishva",25000);
        WithdrawThread t2 = new WithdrawThread(b,"Sanjai",26000);

        t1.start();
        t2.start();
    }
}
