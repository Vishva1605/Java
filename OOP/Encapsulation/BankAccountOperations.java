package Encapsulation;
class AccountBalance{
    int balance;
    int accountnumber;
    public int deposit(int amount){
        balance += amount;
        System.out.println(balance);
        return balance; 
    }
    public int withdrwal(int amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println("Cash has been withdrawed");
        }else{
            System.out.println("insufficient balance");
        }
        return 0;
    }
    public int showbalance(){
        System.out.println(balance);
        return 0;
    }
}
public class BankAccountOperations{
    public static void main(String[] args) {
        //int balance = 0;
        //String accountnumber = "12345678";
        AccountBalance obj1 = new AccountBalance();
        obj1.deposit(10000);
        obj1.withdrwal(300);
        obj1.showbalance();
        
    }
}