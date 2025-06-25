package Encapsulation;
//Create a class BankAccount that initializes account details using a constructor, and use static method to show bank name.

class BankAccount{
    static String bankname = "Indian Bank";
    String name;String accnum;int balance;
    BankAccount(String name,String accnum,int balance){
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }
    void details(){
        System.out.println(name+" : "+accnum+" : "+bankname+" : "+balance);
    }
}
public class BankAccountDetailsDemo {
    public static void main(String[] args) {
        BankAccount cust1 = new BankAccount("ravi","2216171",700);
        BankAccount cust2 = new BankAccount("akash","2216183",800);

        cust1.details();
        cust2.details();
    }
}
