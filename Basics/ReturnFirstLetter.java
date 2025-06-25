public class ReturnFirstLetter {
    public static void main(String[] args) {
        System.out.println(firstChar("Java")); // Expected: J
    }

    public static char firstChar(String str){
        char[] ch = str.toCharArray();
        return ch[0];
    }
}
