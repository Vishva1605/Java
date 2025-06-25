public class ReverseDigit {
    public static void main(string[] args) {
        int N = 1000;
        int sum=0;
        int rev = 0;
        while(N>0){
            sum = N%10;
            N = N/10;
            rev = rev*10+sum;
        }
        System.out.println(rev);
        
    }
}
