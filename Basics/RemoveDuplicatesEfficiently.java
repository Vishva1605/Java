//Remove all duplicate characters from a string
public class RemoveDuplicatesEfficiently {
    public static void main(string[] args) {
        String str = "banana";
        StringBuilder b = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(b.indexOf(String.valueOf(str.charAt(i)))==-1){
                b.append(str.charAt(i));
            }
        }
        System.out.println(b);
    }
}
