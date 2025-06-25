package Others.Exceptions;
import java.util.Scanner;
public class ArrayIndexAccess {
    public static void main(String[] args) {
        final int[] arr = {2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the location : ");
        int loc = sc.nextInt();
        try{
            System.out.println(arr[loc]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Check your limit");
        }
        sc.close();
    }
}
