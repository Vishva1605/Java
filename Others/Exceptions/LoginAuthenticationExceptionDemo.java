package Others.Exceptions;
import java.util.Scanner;
class InvalidCredentialException extends Exception{
    InvalidCredentialException(String msg){
        super(msg);
    }
}
public class LoginAuthenticationExceptionDemo {
    static String login(String username,String password)throws InvalidCredentialException{
        if(!username.equalsIgnoreCase("admin") || !password.equalsIgnoreCase("12345678")){
            throw new InvalidCredentialException("Incorrect Username or Password");
        }else
            return "Login Successfull.";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Username : ");
            String username = sc.nextLine();
            System.out.print("Enter Password : ");
            String password = sc.nextLine();
            System.out.println(login(username,password));
        }catch(InvalidCredentialException e){
            System.out.println("Error : "+e.getMessage());
        }catch(Exception e){
            System.out.println("Some Other Error.");
        }finally{
            sc.close();
            System.out.println("Program Executed.");
        }
    }
}
