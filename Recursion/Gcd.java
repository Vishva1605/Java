public class Gcd {
    public static int div(int a,int b){
        if(b==0) return Math.abs(a);
        return div(b,a%b);
    }
    public static void main(String[] args){
        int a = -14;
        int b = -7;
        System.out.println(div(a,b));
    }
}
