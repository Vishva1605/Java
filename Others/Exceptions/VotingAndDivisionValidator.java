package Others.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class VotingAndDivisionValidator {
    static void divide(int a,int b){
        if(b==0)
            throw new ArithmeticException("Division is Not possible.");
        int n = a/b;
        System.out.println("Division : "+n);
    }
    static void checkAge(int age){
        if(age>=0){
            if(age>=18 && age<=120)
                System.out.println("Age is Valid. You are Eligible to Vote.");  
            else if(age>120)
                System.out.println("Ghosts are Not Allowed To Vote.");  
            else
                System.out.println("Age not valid. You are Not Eligible to Vote.");
        }else
            throw new IllegalArgumentException("Negative Age Not Allowed.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        try{
            do{
                System.out.print("What do You Want Division(D) or CheckAge(A) or Exit(E) : ");
                answer = sc.nextLine().trim();
                if(answer.equalsIgnoreCase("")){
                    break;
                }
                if(answer.equalsIgnoreCase("D")){
                    try{
                        System.out.print("Enter Numerator : ");
                        int a = sc.nextInt();
                        System.out.print("Enter Denominator : ");
                        int b = sc.nextInt();
                        sc.nextLine();
                        divide(a,b);
                    }catch(ArithmeticException e){
                        System.out.println("Error : "+e.getMessage());
                    }catch(InputMismatchException e){
                        System.out.println("Invalid Input in Division.");
                        sc.nextLine();
                    }catch(Exception e){
                        System.out.println("Some Other Error in Divide.");
                    }
                }else if(answer.equalsIgnoreCase("A")){
                    try{
                        System.out.print("Enter Your Age : ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        VotingAndDivisionValidator.checkAge(age);
                    }catch(IllegalArgumentException e){
                        System.out.println("Error : "+e.getMessage());
                    }catch(InputMismatchException e){
                        System.out.println("Invalid Input in Checking Age.");
                        sc.nextLine();
                    }catch(Exception e){
                        System.out.println("Some other Error in checkAge.");
                    }
                }else if(answer.equalsIgnoreCase("E")){
                    System.out.println("Thanking You!");
                }else{
                    System.out.println("Input Mismatched Try Again.");
                }
            }while(!answer.equalsIgnoreCase("E"));
        }catch(Exception e){
            System.out.println("\nSome other problem in choosing method().(Outer)");
        }finally{
            sc.close();
            System.out.println("Exited from Program.");
        } 
    }
}
