public class SumOfDigits {
    public static int sumdig(int n){
        if(n==0) return 0;
        return n%10 + sumdig(n/10);
    }
    public static void main(String[] args){
        System.out.println(sumdig(123));
    }
}
