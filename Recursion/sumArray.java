public class sumArray {
    static int index = 0;
    public static int sum(int[] arr){
        if(arr.length==0) return arr[0];
        if(index<arr.length){
            return arr[index++]+sum(arr);
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }
}
