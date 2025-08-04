import java.util.*;
public class InsertGCD {
    // public static void printGcd(int[] nums){
    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0;i<nums.length-1;i++){
    //         int a = nums[i];
    //         int b = nums[i+1];
    //         list.add(a);
    //         while(b!=0){
    //             int temp = a;
    //             a = b;
    //             b = temp%a;
    //         }
    //         list.add(a);
    //     }
    //     list.add(nums.length-1);
    //     System.out.println(list);
    // }
    public static void printGcd(int[] nums,int i,List<Integer> list){
        if(i<nums.length-1){
            int a = nums[i];
            int b = nums[i+1];
            list.add(Math.abs(a));
            list.add(gcd(a,b));
            printGcd(nums,i+1,list);
        }else{
            list.add(nums.length-1);
        }
    }
    static int gcd(int a,int b){
        if(b==0) return Math.abs(a);
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        int[] nums = {18,6,10,7,9,5};
        List<Integer> list = new ArrayList<>();
        printGcd(nums,0,list);
        System.out.println(list);
    }
}
