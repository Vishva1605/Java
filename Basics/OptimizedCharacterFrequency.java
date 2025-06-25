//Find the frequency of each character in a string(Naana Potathu)
public class OptimizedCharacterFrequency{
    public static void main(string[] args) {
        String str = "PineApple";
        str = str.toLowerCase();
        // StringBuilder b = new StringBuilder(str);

        // for(int i=0;i<b.length();i++){
        //     int k = 1;
        //     if(Character.isLetter(b.charAt(i))){
        //     for(int j = i+1;j<b.length();j++){
        //         if(b.charAt(i) == b.charAt(j)){
        //             k++;  
        //             b.deleteCharAt(j);
        //             j--;
        //         }
        //     }
        //     System.out.println(b.charAt(i)+" : "+k);
        // }
        // }
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char) (i+'a') + ":" + freq[i]);
            }
        }
    }
}