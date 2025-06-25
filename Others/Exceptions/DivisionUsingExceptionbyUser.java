package Others.Exceptions;
import java.util.Scanner;
public class DivisionUsingExceptionbyUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the First Integer A : ");
            int a = sc.nextInt();
            System.out.print("Enter the Second Integer B : ");
            int b = sc.nextInt();
            double divide = a/b;
            System.out.println("Divided output : "+divide); 
        }catch(ArithmeticException e){
            System.out.println("Denominator Cannot be a Zero.");
        }catch(Exception e){
            System.out.println("Invalid Input Cannot be Accepted.");
        }finally{
            System.out.println("Program Completed");
        }
        sc.close();
    }
}
