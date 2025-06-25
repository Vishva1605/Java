public class RemoveWhitespacesFromString {
    public static void main(string[] args) {
        String str = " Remove all white spaces from a string. ";
        //String noWhitespace = str.replaceAll("\\s", "");
        StringBuffer res = new StringBuffer(str);
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)== ' '){
                res = res.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(res.toString());
        //System.out.println(noWhitespace);
    }
}
