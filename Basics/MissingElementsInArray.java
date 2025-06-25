import java.util.Arrays;

public class MissingElementsInArray {
    public static void main(string[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,23,24,25,26,27,28,29,30,60,82,19,63};
        Arrays.sort(arr);
        int count = 1;
        System.out.print("Missing Elements in an Array : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=count){
                while(count!=arr[i]){
                    System.out.print(count + " ");
                    count++;
                }
            }
            count++;
        }
    }    
}
