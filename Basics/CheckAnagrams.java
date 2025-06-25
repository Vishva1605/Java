// check anaagram or not
public class CheckAnagrams {
    public static void main(String[] args) {
        String a = "aabb";
        String b = "bbaa";
        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder B = new StringBuilder(b);
        String c = "";
        boolean str = false;
            for(int i=0;i<a.length();i++){
                for(int j=0;j<B.length();j++){
                if(a.charAt(i) == B.charAt(j)){
                    str = true;
                    B.deleteCharAt(j);
                    j--;
                    break;
                }else{
                    str = false;
                }
                }
                if(str){
                    c = c+a.charAt(i);
                }
                
            }
            if(c.equals(a)){
                System.out.println("yes it is an anagram");
            }else{
                System.out.println("it's not an anagram");
            }
    }
}
