import java.util.Scanner;
class BankAccount{
    private String name;
    protected double balance;
    BankAccount(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    void printDetails(){
        System.out.println("\tDetails");
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }
}
class SavingsAccount extends BankAccount{
    private int intrestrate;
    SavingsAccount(String name,double balance,int intrestrate){
        super(name, balance);
        this.intrestrate = intrestrate;
    }
    double calculateIntrestaRate(){
        return (intrestrate/100.0)*balance;
    }
    @Override
    void printDetails(){
        super.printDetails();
        System.out.println("Intrest Rate : Rs."+calculateIntrestaRate());
        System.out.println("Total Balance : Rs."+(calculateIntrestaRate()+balance));
    }
}
public class SuperBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name  : ");
        String name = sc.nextLine();
        System.out.print("Enter Balance : ");
        double balance = sc.nextDouble();
        System.out.print("Intrest Rate : ");
        int intrestrate = sc.nextInt();
        SavingsAccount s1 = new SavingsAccount(name, balance, intrestrate);
        s1.printDetails();
        sc.close();
    }
}
