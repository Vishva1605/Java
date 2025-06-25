public class CapitalizeEachWord {
    public static void main(string[] args) {
        String str = "Capitalize the first letter of each word in a sentence";
        str = str.trim().toLowerCase();
        char arr[] = str.toCharArray();
        if(arr.length>0){
        arr[0]=Character.toUpperCase(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ' '){
               arr[i+1]=Character.toUpperCase(arr[i+1]);
            }
        }
        arr.toString();
        System.out.println(arr);
        }else{
            System.out.println("Enter a String");
        }
    }
}
