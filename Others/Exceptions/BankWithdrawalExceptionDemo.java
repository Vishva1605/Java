package Others.Exceptions;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
public class BankWithdrawalExceptionDemo {
    static void withdraw(int balance,int amount)throws InsufficientBalanceException{
        if(amount>balance || amount<=0){
            throw new InsufficientBalanceException("Insufficient balance / negative amount.");
        }else{
            balance-=amount;
            System.out.println("Amount of Rs."+amount+" withdrawl. Balance : Rs."+balance);
        }
    }
   public static void main(String[] args) {
        try{
            withdraw(50000,500000);
        }catch(InsufficientBalanceException e){
            System.out.println("Error : "+e.getMessage());
        }catch(Exception e){
            System.out.println("Some other Error.");
        }finally{
            System.out.println("program executed.");
        }
   } 
}
