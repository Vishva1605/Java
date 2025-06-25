package Others.Others;
class Bank{
    private String bankname;
    private int account;
    Bank(String bankname,int account){
        this.bankname = bankname;
        this.account = account;
    }
    class Account{
        void display(){
            System.out.println("Bank Name : "+bankname+" || Account : "+account);
        }
    }
}
class MemberInnerClass{
    public static void main(String[] args) {
        Bank b1 = new Bank("Indian Bank",990008);
        Bank.Account a1 = b1.new Account();
        a1.display();
    }
}