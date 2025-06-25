public class Array_dup_Elements {
    public static void main(string[] args) {
        int[] arr = {1,2,2,3,4,4};
        int[] temp = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
                temp[k++] = arr[i];
        }
        for(int num : temp){
            System.out.print(num + " ");
        }
    }
}