public class LongestUniqueSubstring {
    public static void main(string[] args) {
        String str = "raviprasath";
        int max = 0;
        String Lstr = "";
        for(int i=0;i<str.length();i++){
            StringBuilder temp = new StringBuilder();
            for(int j=i;j<str.length();j++){
                if(temp.toString().indexOf(str.charAt(j)) != -1){
                    break;
                }
                temp.append(str.charAt(j));
            }
            if(temp.length()>max){
                max  = temp.length();
                Lstr = temp.toString();
            }
        }
        System.out.println("max length : "+max);
        System.out.println("longest string : "+Lstr);
    }
}

