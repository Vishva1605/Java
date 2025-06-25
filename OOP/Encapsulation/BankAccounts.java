package Encapsulation;
class BankAccount{
    private String accountnumber;
    private double balance;

    public BankAccount(String accountnumber,double balance){
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount>0 && amount!=0){
            balance += amount;
            System.out.println("Money Deposited of Rs."+amount+" on Account "+accountnumber);
        }else
            System.out.println("Negative Amount Can't be Deposit");
        System.out.println();
    }
    void withdraw(double amount){
        if(amount > 0 && amount!=0 && amount<=balance){
            balance -= amount;
            System.out.println("Money Withdrawl of Rs."+amount+" on Account "+accountnumber);
        }else
            System.out.println("Insuficient Balance / Negative amount cant be withdrwal");
        System.out.println();
    }
    void showbalance(){
        System.out.println("Account Balance : Rs."+balance);
        System.out.println();
    }
}
public class BankAccounts{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("2216171",50000);
        BankAccount b2 = new BankAccount("2216172", 60000);

        b1.deposit(1000);
        b1.withdraw(34000);
        b1.showbalance();

        b2.deposit(-2);
        b2.withdraw(0);
        b2.showbalance();
    } 
}
// Bank Account

// Fields: accountNumber, balance

// Add methods: deposit(), withdraw()

// Prevent setting negative balance.
