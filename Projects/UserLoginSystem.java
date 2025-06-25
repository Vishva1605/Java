
import java.util.Scanner;
class User{
    private String username;
    private String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    boolean validatelogin(String username,String password){
        boolean login = this.username.equals(username) && this.password.equals(password);
        if(login){
            System.out.println("Login Sucessful");
            System.out.println();
            return true;
        }else{
            System.out.println("Login Failed");
            System.out.println();
            return false;
        }
    }

    void changepassword(String Oldpassword,String Newpassword){
        boolean change = this.password.equals(Oldpassword);
        if(change){
            this.password = Newpassword;
            System.out.println("Password Changed");
        }else{
            System.out.println("Wrong Password");
        }
        System.out.println();
    }
}
public class UserLoginSystem {
    public static void main(String[] args) {
        User u1 = new User("Vishva", "12345678");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String Username = sc.nextLine();
        System.out.print("Enter Password : ");
        String Password = sc.nextLine();
        u1.validatelogin(Username,Password);

        System.out.print("Do you want to Change Password ?(yes/no) : ");
        String answer = sc.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            System.out.print("Enter Old_Password : ");
            String Oldpassword = sc.nextLine();
            System.out.print("Enter New_Password : ");
            String Newpassword = sc.nextLine();
            u1.changepassword(Oldpassword,Newpassword);
        }

        System.out.println("Do you want to Login ?(yes/no) : ");
        answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.print("Enter Username : ");
            Username = sc.nextLine();
            System.out.print("Enter Password : ");
            Password = sc.nextLine();
            u1.validatelogin(Username,Password);
        }
        sc.close();

    }
}
// User Login System

// User class: username, password

// Restrict direct access to password

// Create method to validate login