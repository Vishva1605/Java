package Others.Others;
//Create a static method that returns the square of a number.
public class StaticSquareCalculator {
    static int square(int a){
        return a*a;
    }
    public static void main(String[] args) {
        int result=square(2);
        System.out.println("Square value : "+result);
    }
}
