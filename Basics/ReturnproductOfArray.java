public class ReturnproductOfArray {
    public static void main(string[] args) {
        int[] nums = {2, 3, 4};
        System.out.println(product(nums)); // Expected: 24
    }

    public static int product(int[] arr){
        int mul = 1;
        for(int i=0;i<arr.length;i++){
           mul = mul * arr[i]; 
        }
        return mul;
    }
}
