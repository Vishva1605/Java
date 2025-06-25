package Others.Others;
//Use a static block to initialize a static array of 5 integers and print their sum in main.
public class StaticBlockArraySum {
    static int sum = 0;
    static int[] arr ;
    static{
        arr = new int[]{8,9,7,6,5};
    }
    public static void main(String[] args) {
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
