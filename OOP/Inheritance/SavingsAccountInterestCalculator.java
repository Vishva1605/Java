class BankAccount{
    private long accountnumber;
    private double balance;

    public BankAccount(long accountnumber,double balance){
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }

}
class SavingsAccount extends BankAccount{
    private int interestrate;
    public SavingsAccount(long accountnumber,double balance,int interestrate){
        super(accountnumber, balance);
        this.interestrate = interestrate;
    }
    void calcInterest(){
        double intrest = interestrate/100.0 * getBalance();
        System.out.println("Intrest for Account "+getAccountnumber()+" is : Rs."+intrest);
    }
    void showFinalBalance(){
        double intrest = interestrate/100.0 * getBalance();
        double total = intrest + getBalance();
        System.out.println("Final Balance of Account "+getAccountnumber()+" is Rs."+total);
    }
}
public class SavingsAccountInterestCalculator {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(2216171, 50000, 3);

        s1.calcInterest();
        s1.showFinalBalance();
    }
}

// 5. Bank Account
// Parent Class: Account with accountNumber and balance.

// Child Class: SavingsAccount with interestRate.

// Task: Compute interest and show final balance.
