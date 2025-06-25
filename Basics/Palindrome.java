public class Palindrome {
    public static void main(string[] args) {
        int n = 121;
        int temp = n;
        int res = 0;
        while(temp>0){
            int a = temp % 10;
            res = res * 10 + a ;
            temp/=10;
        }
        //System.out.print(res);
        if(res == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("oombuda");
        }

    }
}
