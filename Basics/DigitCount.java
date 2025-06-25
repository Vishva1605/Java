public class DigitCount {
    public static void main(string[] args) {
        int n = 1234;
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
