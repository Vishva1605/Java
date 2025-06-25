//Replace every vowel with * (or any symbol).
public class ReplaceVowelsWithSymbol {
    public static void main(string[] args) {
        String str = "Mango";
        StringBuilder builder = new StringBuilder();
        str = str.trim().toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                builder.append('*');
            }else{
                builder.append(ch);
            }
        }
        System.out.println(builder.toString());


    }
}
