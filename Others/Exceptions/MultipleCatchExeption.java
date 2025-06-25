package Others.Exceptions;
public class MultipleCatchExeption {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int[] arr = new int[3];
        try{
            double n = a/b;
            System.out.println("Divided : "+n);
            System.out.println(arr[8]);
        }catch(ArithmeticException e){
            System.out.println("zero occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("check limit");
        }
    }
}
