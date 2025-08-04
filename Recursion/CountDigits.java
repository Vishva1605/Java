public class CountDigits {
    public static int digits(int num,int count){
        if(num <= 0) num = -num;
        if(num == 0) return (count==0)?1:count;
        return digits(num/10,count+1);
    }
    public static void main(String[] args){
        int num = 012345;
        int count = 0;
        System.out.println(digits(num,count));
    }
}
