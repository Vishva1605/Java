public class ManualCaseConverter {
    public static void main(String[] args) {
        String str = "Ravi";
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            }
            res += (char) ch;
        }
        System.out.println("Lower case : " + res);

        res = "";
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                ch -= 32;
            }
            res += (char) ch;
        }
        System.out.println("Upper case : " + res);
    }
}
