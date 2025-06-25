package Others.Exceptions;
import java.util.Scanner;
class UnderageDrivingException extends Exception{
    UnderageDrivingException(String msg){
        super(msg);
    }
}
public class DrivingEligibilityChecker {
    static void checkDrivingEligibility(int age)throws UnderageDrivingException{
        if(age<18 && age>=0){
            throw new UnderageDrivingException("Not Eligible Due to Underage.");
        }else if(age<0 || age >120){
            throw new IllegalArgumentException("Invalid Age's.");
        }else{
            System.out.println("Eligible to Drive.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the age : ");
            int age = sc.nextInt();
            checkDrivingEligibility(age);
        }catch(UnderageDrivingException e){
            System.out.println("Error : "+e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }catch(Exception e){
            System.out.println("Some other Errors.");
        }finally{
            sc.close();
            System.out.println("Program Executed.");
        }
    }
}
