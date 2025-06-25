import java.util.Scanner;
class StringPalindrome {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        if(sb.reverse().toString().matches(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}