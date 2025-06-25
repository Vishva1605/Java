//find the first non repeating character 
public class NonReapetingCharacters {
    public static void main(String[] args) {
        String str = "Teeterr";
        str = str.toLowerCase();
        StringBuilder b = new StringBuilder(str);
        boolean found = false;
        for(int i=0;i<b.length();i++){
            found = true;
            for(int j=i+1;j<b.length();j++){
                if(b.charAt(i) == b.charAt(j)){
                    found = false;
                    b.deleteCharAt(j);
                    j--;
                }
            }
            if(found){
                    System.out.println(b.charAt(i));
                    break;
                }
        }
        if(!found){
            System.out.println("no non reapeated character");
        }
    }
}
