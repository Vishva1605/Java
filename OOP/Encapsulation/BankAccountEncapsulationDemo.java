package Encapsulation;
class Bankaccount{
    private String accountnumber;
    private int balance;

    public String getaccountnumber(){
        return accountnumber;
    }
    public int getbalance(){
        return balance;
    }

    public void setdetails(String accnum,int bal){
        accountnumber = accnum;
        balance = bal;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposit amount : "+amount);
    }
    public void withdrawl(int amount){
        if(balance>=amount){
            balance -=amount;
            System.out.println("amount withdrawl : "+amount);
        }else{
            System.out.println("insufficient balance");
        }
    }
    public void balance(){
        System.out.println("Balance : "+balance);
    }
}
public class BankAccountEncapsulationDemo {
    public static void main(String[] args) {

        Bankaccount b1 = new Bankaccount();
        Bankaccount b2 = new Bankaccount();

        b1.setdetails("1234",500);
        b2.setdetails("4321",600);


        b1.balance();
        b2.balance();
        
        b1.deposit(500);
        b2.deposit(200);

        b1.withdrawl(200);
        b2.withdrawl(300);


    }
}
