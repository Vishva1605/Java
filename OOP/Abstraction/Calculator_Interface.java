import java.util.Scanner;
interface Calculator{
    default int add(int a,int b){return a+b;}
    default int subtract(int a,int b){return a-b;}
}
class SimpleCalculator implements Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int Subtract(int a,int b){
        return a-b;
    }
} 
public class Calculator_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator Calc = new SimpleCalculator();
        System.out.print("Enter the Values of A : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Value Of B : ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Addition : "+Calc.add(a,b));
        System.out.println("Subtraction : "+Calc.subtract(a,b));
        sc.close();
    }
}
