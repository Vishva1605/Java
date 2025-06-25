
import java.util.Scanner;
class Array_Max_Min {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            System.out.print("Array "+i+" : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }else if(min>arr[i]){
                min = arr[i];
            }
        }
        sc.close();
        System.out.println("maximum : "+max);
        System.out.println("minimum : "+min);
    
    }
}