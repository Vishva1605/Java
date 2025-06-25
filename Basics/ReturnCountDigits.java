public class ReturnCountDigits {
    public static void main(string[] args) {
        System.out.println(countDigits(54320)); // Expected: 5
    }

    public static int countDigits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
