package Others.Enum;
class BankAccount{
    enum AccountType{
        SAVINGS(4),CURRENT(1),FIXED(6);
        private int intrestRate;
        AccountType(int intrestRate){
            this.intrestRate = intrestRate;
        }
    }
    private String holderName;
    private AccountType type;
    BankAccount(String holderName,AccountType type){
        this.holderName = holderName;
        this.type = type;
    }
    String printDetails(){
        return holderName+" has choosen '"+type+"' type of Intrest "+type.intrestRate;
    }
}
public class EnumerationsBankAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Vishva", BankAccount.AccountType.FIXED);
        System.out.println(b.printDetails());
    }
}
