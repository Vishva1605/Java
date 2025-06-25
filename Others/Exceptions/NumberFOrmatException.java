package Others.Exceptions;
import java.util.Scanner;
public class NumberFOrmatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String in Numbers : ");
        String str = sc.nextLine();
        try{
            int num = Integer.parseInt(str); 
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Input only contains Number");
        }
        sc.close();
    }
}
