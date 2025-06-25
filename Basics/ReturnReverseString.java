public class ReturnReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello")); // Expected: "olleh"
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
