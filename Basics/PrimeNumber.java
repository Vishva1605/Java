public class PrimeNumber {
    public static void main(string[] args) {
        int n = 11;
        for(int i=2;i<=Math.sqrt(n);){
            if(n%i==0){
                System.out.println("Not a prime number");
            }
            break;
        }
        if(n%2!=0){
        System.out.println("it is a prime number");
        }
    }
}
