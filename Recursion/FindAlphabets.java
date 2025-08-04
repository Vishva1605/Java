public class FindAlphabets {
    public static void main(String[] args){
        int[] nums = {7,3,11,5,0,1,2};
        char[] ch = new char[nums.length];
        for(int i=0;i<nums.length;i++){
            ch[i] = (char)(nums[i]+97);
        }
        System.out.print(ch);
    }
}
