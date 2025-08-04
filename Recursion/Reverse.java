public class Reverse {
    static int res=0;
    public static int rev(int n){
        if(n==0) return res;
        res=res*10+n%10;
        return rev(n/10);
    }
    public static void main(String[] args){
        System.out.println(rev(123));
    }
}
