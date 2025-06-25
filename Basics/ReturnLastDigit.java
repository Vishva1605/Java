public class ReturnLastDigit {
    public static void main(string[] args) {
        System.out.println(lastDigit(1298)); // Expected: 8
    }

    public static int lastDigit(int num){
       num = num%10;
        return num;
    }
}
