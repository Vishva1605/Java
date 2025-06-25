//Convert a string to uppercase and lowercase manually.(in single loop)
public class ManualCaseConverterSingleLoop {
    public static void main(string[] args) {
        String str = "raVi";
        String res1 = "";
        String res2 = "";
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i);
            if(ch>=65&&ch<97){
                ch += 32;
                res1 += (char)ch;
            }else {
                res1 += str.charAt(i);
            }

            if(ch>=97 && ch<=122){
                ch -= 32;
                res2 += (char)ch;
            }else{
                res2 += str.charAt(i);
            }
        }
        System.out.println("Lower case : "+res1);
        System.out.println("Upper Case : "+res2);
    }
}
