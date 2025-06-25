package Others.Threads;
class BankAccount{
    private int balance = 1000;
    synchronized void withdraw(String name,int amount){
        System.out.println("Person "+name+" wants to withdraw Amount of Rs."+amount);
        if(amount<=balance && amount>=0){
            balance -= amount;
            System.out.println("Withdrawl Successfull.");
        }else{
            System.out.println("Insufficient Balance.");
        }
    }
}
class withdrawThread extends Thread{
    BankAccount account;
    String name;
    int amount;
    withdrawThread(BankAccount account,String name,int amount){
        this.account = account;
        this.name = name;
        this.amount = amount;
    }
    public void run(){
        account.withdraw(name, amount);
    }
}
public class BankAccountWithdraw {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        withdrawThread t1 = new withdrawThread(b, "Revi", 200);
        withdrawThread t2 = new withdrawThread(b, "Ravi", 900);

        t1.start();
        t2.start();
    }
}
