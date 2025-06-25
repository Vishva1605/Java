import java.util.Scanner;
class StringReverse {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];int j = 0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j++] = arr[i];
        }
        //System.out.println("Reverse String : "+String.valueOf(arr1));
        System.out.println("Reverse String : "+new String(arr1));
        sc.close();
    }
}