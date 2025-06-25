package Others.Exceptions;
import java.util.Scanner;
public class ArrayAndArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the Number of Elements : ");
            int count = sc.nextInt();
            int[] arr = new int[count];
            for(int i=0;i<count;i++){
                System.out.print("Enter the "+(i+1)+"th Element : ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Number at 6th position of Array is : "+arr[3]);
            double divide = count/0;
            System.out.println(divide);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Check Array Limit");
        }catch(ArithmeticException e){
            System.out.println("Demonitor is a Zero");
        }catch(Exception e){
            System.out.println("Invalid Input");
        }finally{
            System.out.println("Extecuted Succesfully");
        }
        sc.close();
    }
}
