public class ReturnBoolean {
    public static void main(string[] args) {
        System.out.println(isPositiveAndEven(10)); // Expected: true
        System.out.println(isPositiveAndEven(-4)); // Expected: false
    }

    public static boolean isPositiveAndEven(int num){
        return num>0&&num%2==0;
    }
}
