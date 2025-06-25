
class BankAccount{
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
    String getAccountNumber(){
        return accountNumber;
    }
    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Money Deposited Rs."+amount+" on Account "+accountNumber);
        }else{
            System.out.println("Deposit Failed!. Check Amount");
        }
        System.out.println();
    }
    void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance -= amount;
            System.out.println("Money Withdrawl Rs."+amount+" on Account "+accountNumber);
        }else{
            System.out.println("Insufficient Balance / Withdrawl Failed!. Check Amount");
        }
        System.out.println();
    }
    void getAccountDetails(){
        System.out.println("     Account Details");
        System.out.println("---------------------------");
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Balance : "+balance);
        System.out.println("---------------------------");
    }
}
class SavingsAccount extends BankAccount{
    private int interestRate;
    private double total;
    public SavingsAccount(String accountNumber,double balance){
        super(accountNumber, balance);
    }
    void addInterest(int intrestRate){
        this.interestRate = intrestRate;
        double intrest = interestRate/100.0 * getBalance();
        total = getBalance() + intrest;
        System.out.println("Intrest of Rs."+intrest+" Added to Account "+getAccountNumber());
        System.out.println();
    }
    @Override
    void getAccountDetails(){
        System.out.println("     Account Details");
        System.out.println("---------------------------");
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Balance : "+total);
        System.out.println("---------------------------");
    }
}
class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    private double balance;
    public CurrentAccount(String accountNumber,double balance){
        super(accountNumber,balance);
        this.overdraftLimit = 30000;
    }
    @Override
    void withdraw(double amount){
        overdraftLimit = getBalance()+overdraftLimit;
        balance = getBalance() - amount;
        if(amount>0 && amount<= overdraftLimit){
            overdraftLimit -= amount;
            System.out.println("Money Withdrawl Rs."+amount+" on Account "+getAccountNumber());
        }else{
            System.out.println("Insufficient Balance / Withdrawl Failed!. Check Amount");
        }
        System.out.println();
    }
    @Override
    void getAccountDetails(){
        System.out.println("     Account Details");
        System.out.println("---------------------------");
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Balance : "+balance);
        System.out.println("---------------------------");
    }
    void checkOverdraft(){
        System.out.println("Over Draft Limit : "+overdraftLimit);
        System.out.println();
    }
}
public class AccountManagementSystem {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("2216171", 50000);
        s1.deposit(5000);
        s1.addInterest(5);
        s1.getAccountDetails();

        CurrentAccount c1 = new CurrentAccount("2216171", 50000);
        c1.deposit(4000);
        c1.withdraw(60000);
        c1.checkOverdraft();
        c1.getAccountDetails();
    }
}
// 💼 Problem: Bank Account System
// 🔸 Parent Class: BankAccount (Encapsulated)
// accountNumber (String) – private

// balance (double) – private

// Methods:

// deposit(double amount)

// withdraw(double amount)

// getAccountDetails()

// 🔸 Child Classes (Hierarchical Inheritance):
// SavingsAccount (inherits from BankAccount)

// interestRate (private)

// Method: addInterest()

// CurrentAccount (inherits from BankAccount)

// overdraftLimit (private)

// Method: checkOverdraft()

