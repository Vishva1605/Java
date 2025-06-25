package Encapsulation;
//Atm machine simulator
class Atm{
    private int pin;
    private double balance;
    boolean ispin = false;
    //costructor
    public Atm(double balance){
        this.balance = balance;
    }
    //getters
    public double getBalance(){
        return balance;
    }
    //methods
    public void setpin(int newpin){
        if(!ispin){
            this.pin = newpin;
            ispin = true;
            System.out.println("new Pin Number Created");
        }else
            System.out.println("Pin already Created. use changepin() to change the pin");
    }
    public void changepin(int oldpin,int newpin){
        if(this.pin == oldpin){
            this.pin = newpin;
            System.out.println("Pin Number Changed");
        }else
            System.out.println("Invalid pin Number. Enter valid Pin");
    }
    public boolean verifypin(int enterpin){
        return this.pin == enterpin;
    }
    public void deposit(int amount,int enterpin){
        if(verifypin(enterpin)){
            balance += amount;
            System.out.println("Money Deposited of Rs:"+amount);
        }else
            System.out.println("Invalid Pin");
    }
    public void withdrawl(int amount,int enterpin){
        if(verifypin(enterpin)){
            if(balance>=amount){
                balance -= amount;
                System.out.println("Money Withdrawled of Rs:"+amount);
            }else
                System.out.println("Insufficient Balance");
        }else
        System.out.println("Invalid Pin");
    }
    public void checkbalance(int enterpin){
        if(verifypin(enterpin))
            System.out.println("Account Balance Rs:"+balance);
        else
            System.out.println("Invalid Pin");
    }
}
//main
public class ATMTransactionSimulator {
    public static void main(String[] args) {
        Atm c1 = new Atm(50000);
        Atm c2 = new Atm(60000);

        c1.setpin(1621);
        c1.verifypin(1621);
        c1.deposit(2000,1621);
        c1.withdrawl(23000,1621);
        c1.checkbalance(1621);

        c2.setpin(2005);
        c1.verifypin(1621);
        c1.deposit(4000,2005);
        c2.withdrawl(50000,2005);
        c2.checkbalance(2005);
    }
}
