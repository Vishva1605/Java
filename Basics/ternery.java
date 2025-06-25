import java.util.Scanner;

public class ternery {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        //if(n%2==0){
          //  result =  10;
        //}else{
          // result = 20;
        //}
        result = n%2==0 ? 10 : 20 ;
        System.out.println(result);
        System.out.println();
        int x = 10;
        int y = 20;
        int res = x>y?x:y;
        System.out.println(res);
        sc.close();
    }
}
