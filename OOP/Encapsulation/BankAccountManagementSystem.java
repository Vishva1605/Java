package Encapsulation;
//bank with mutiple accounts

class BankAccount{
    private String name;
    private int accnum;
    private double balance;
//constructor
    public BankAccount(String Holdername,int Accountnumber,double balance){
        this.name = Holdername;
        this.accnum = Accountnumber;
        this.balance = balance;
    }
//getters
    public String getName(){
        return name;
    }
    public int getAccNum(){
        return accnum;
    }
    public double balance(){
        return balance;
    }
//methods
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Money Deposited : Rs."+amount);
        }else{
            amount = 0;
            System.out.println("Money Deposited : Rs."+amount);
        }
        System.out.println();
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Money Withdrawal : Rs."+amount);
        }else if(amount>balance)
            System.out.println("Insufficient Balance : Rs."+balance);
        else{
            amount = 0;
            System.out.println("Money withdrawal : Rs."+amount);
        }
        System.out.println();
    }
    public void transfer(BankAccount reciever,double amount){
        if(amount<=balance){
            balance -= amount;
            double recieved = reciever.balance+amount; 
            System.out.println("Money Transfered from "+reciever.name+" to "+this.name+" of Rs."+recieved);
        }else if(amount>balance)
            System.out.println("Insufficient Balance : Rs."+balance);
        else{
            amount = 0;
            System.out.println("Money Transfered : Rs."+amount);
        }
        System.out.println();
    }
    public void getDetails(){
        System.out.println("Account Holder : "+name);
        System.out.println("Account Number : "+accnum);
        System.out.println("Account Balance : Rs."+balance);
        System.out.println("--------------------------------------");
    }
}
public class BankAccountManagementSystem {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Vishva", 2216171, 50000);
        BankAccount b2 = new BankAccount("Vishnu",2216172,40000);

        b1.getDetails();
        b1.deposit(5000);
        b1.withdraw(10000);
        b1.transfer(b2, 1000);

        b2.getDetails();
        b2.deposit(500);
        b2.withdraw(4000);
        b2.transfer(b1, 3000);

        b1.getDetails();
        b2.getDetails();
    }
}
