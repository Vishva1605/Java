import java.util.Arrays;

public class SortColonSeparatedNumbers {
    public static void main(string[] args) {
        String str = "90:20:50:110";
        String[] arr = str.split(":");
        int[] num = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
            if(i<num.length-1){
                System.out.print(":");
            }
        }
    }
}
