//Remove all duplicate characters from a string.
public class RemoveDuplicateCharacters {
    public static void main(string[] args) {
        String str = "banana";
        str = str.toLowerCase();
        StringBuilder b = new StringBuilder(str);
        for(int i=0;i<b.length();i++){
            for(int j=i+1;j<b.length();j++){
            if(b.charAt(i) == b.charAt(j)){
                b.deleteCharAt(j);
                j--;
            }
        }
        }
        System.out.println(b.toString());
    }
}
