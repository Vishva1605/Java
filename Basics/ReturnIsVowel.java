public class ReturnIsVowel {
    public static void main(string[] args) {
        System.out.println(isVowel('e')); // Expected: true
    }

    public static boolean isVowel(char c){
        return(c == 'a'||c== 'e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
}
