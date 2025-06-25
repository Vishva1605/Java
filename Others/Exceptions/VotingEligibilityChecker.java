package Others.Exceptions;
import java.util.Scanner;
public class VotingEligibilityChecker {
    int checkAge(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            throw new IllegalArgumentException("Not Eligible to vote");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingEligibilityChecker a = new VotingEligibilityChecker();
        try{
            System.out.print("Enter the Age : ");
            int age = sc.nextInt();
            a.checkAge(age);
        }catch(IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
        sc.close();
    }
}
