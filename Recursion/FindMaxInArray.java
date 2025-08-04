public class FindMaxInArray {
    public static int maxi(int[] arr,int max,int index){
        if(arr.length == 0) return Integer.MIN_VALUE;
        if(index<arr.length){
            if(max<arr[index]) max = arr[index];
            return maxi(arr,max,index+1);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {};
        int max = arr[0];
        int index = 0;
        System.out.println(maxi(arr,max,index));
    }
}
