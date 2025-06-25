public class IntegerReverse {
    public static void main(string[] args) {
        int  n = 1551;
        //int  m = n;
        int rev = 0;
        int temp=n;
        do{
            temp = n%10;
            rev = rev*10+temp ;
            n = n/10;
        }while(n!=0);
        System.out.println(rev);
       // if(rev == m){
       //     System.out.println("palindome");
       // }else{
        //    System.out.println("not palindrome");
       // }
    }
}
