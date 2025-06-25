public class SwapFirstLastCharacters {
    public static void main(string[] args) {
        String str = "Swap first and last characters of a string";
        StringBuilder res = new StringBuilder(str);
        char a = str.charAt(0);
        char b = str.charAt(str.length()-1);
        //String c = str.substring(1,str.length()-1);
        res = res.deleteCharAt(0);
        res = res.deleteCharAt(res.length()-1);
        System.out.printf("%c"+res.toString()+"%c",b,a);
        //String swap = b + c + a;
        //System.out.println(swap);
    }
}