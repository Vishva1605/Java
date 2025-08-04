public class Fibonaaci {
    public static int fibonaci(int num){
        if(num==0||num == 1) return 1;
        return fibonaci(num-1)+fibonaci(num-2);

    }
    public static void main(String[] args){
        int num = 6;
        System.out.println(fibonaci(num));
    }
}
