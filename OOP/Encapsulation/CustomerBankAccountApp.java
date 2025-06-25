package Encapsulation;
class Customer{
    private String name;
    private int id;
    private int accnum;

    public Customer(String HolderName,int HolderID,int AccountNum){
        this.name = HolderName;
        this.id = HolderID;
        this.accnum = AccountNum;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public int getAccNum(){
        return accnum;
    }
}

class BankAccount{
    private int accnum;
    private double balance;
    Customer c;

    public BankAccount(Customer c,double balance){
        this.accnum = c.getAccNum();
        this.balance = balance;
        this.c = c;
    }

    public int getAccNum(){
        return accnum;
    }
    public double getBalance(){
        return balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Amount of Rs."+amount+" Deposited in Account "+accnum);
        }else{
            System.out.println("Cannot be Deposited due to Negative Amount : "+amount);
        }
        System.out.println();
    }
    void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance -= amount;
            System.out.println("Amount of Rs."+amount+" Withdrawl in Account "+accnum);
        }else{
            System.out.println("Insufficient Balance : "+balance);
        }
        System.out.println();
    }
    void showdetails(){
        System.out.println("Bank Details :");
        System.out.println("------------------------");
        System.out.println("Holder_Name : "+c.getName());
        System.out.println("Holder_Id : "+c.getID());
        System.out.println("Account_Number : "+accnum);
        System.out.println("Account_Balance : "+balance);
        System.out.println();
    }
}
public class CustomerBankAccountApp {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(new Customer("Vishva", 100, 2216171), 50000);
        BankAccount b1 = new BankAccount(new Customer("Vishnu", 101, 2216172), 60000);
        b.deposit(20000);
        b.withdraw(23000.16);
        b.showdetails();
        b1.deposit(15000);
        b1.withdraw(14000);
        b1.showdetails();
    }
}
