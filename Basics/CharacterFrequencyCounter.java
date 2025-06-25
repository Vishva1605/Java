//Find the frequency of each character in a string
public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String str = "Pineapple";
        String a = str.toLowerCase();
        int arr[] = new int[256];
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            arr[ch]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && Character.isLetter((char)i)){
                System.out.println((char)i+" : "+arr[i]);
            }
        }
    }
}
