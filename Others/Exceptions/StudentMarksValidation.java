package Others.Exceptions;
import java.util.Scanner;
class InvalidMarksException extends Exception{
    InvalidMarksException(String msg){
        super(msg);
    }
}
public class StudentMarksValidation {
    void checkMarks(String name,int marks)throws InvalidMarksException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException("Invalid Marks.");
        }else{
            System.out.println(name+" got "+marks+" Marks");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentMarksValidation m = new StudentMarksValidation();
        try{
            System.out.print("Enter the Student Name : ");
            String name = sc.nextLine();
            System.out.print("Enter the Student Marks : ");
            int marks = sc.nextInt();
            m.checkMarks(name,marks);
        }catch(InvalidMarksException e){
            System.out.println("Error : "+e.getMessage());
        }catch(Exception e){
            System.out.println("Some other Error.");
        }finally{
            sc.close();
            System.out.println("Program Executed.");
        }
    }
}
