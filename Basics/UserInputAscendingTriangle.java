import java.util.Scanner;
public class UserInputAscendingTriangle {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0 ;
        while(i<=n){
            int j=0;
            while(j <= i){
                System.err.print("* ");
                j++;
            }
            System.err.println();
            i++;
        }
        sc.close();
    }
}
