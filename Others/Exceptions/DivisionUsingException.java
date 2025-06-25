package Others.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;;
@FunctionalInterface
interface Divisor{
    void divide();
}
public class DivisionUsingException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer A : ");
        int a = sc.nextInt();
        System.out.print("Enter the Integer B : ");
        int b = sc.nextInt();
        Divisor d = () -> {
            try{
                double n = a/b;
                System.out.println(n);
            }catch(InputMismatchException e){
                System.out.println("Invalid input");
            }catch(ArithmeticException e){
                System.out.println("Divider is zero");
            }
        };
        d.divide();
        sc.close();
    }
}
