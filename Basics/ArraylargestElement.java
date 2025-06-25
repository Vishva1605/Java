import java.util.Scanner;
public class ArraylargestElement{
    public static void main(string []args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0 ; i<num.length ; i++){
            num[i] = sc.nextInt();
        }
        int min = -1;
        for(int i = 0;i<num.length;i++){
            if(num[i]>min){
                min = num[i];
            }
        }
        System.out.println("Largest element :"+min);
        sc.close();
    }
}