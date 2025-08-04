public class printArray {
    public static void print(int[] arr,int index){
        if(arr.length == 0) System.out.println(arr[0]);
        if(index<arr.length){
            print(arr, index+1);
            System.out.print(arr[index]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int index = 0;
        print(arr,index);
    }
}