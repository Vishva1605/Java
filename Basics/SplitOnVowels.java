//Split the string on vowels and print each part
public class SplitOnVowels {
    public static void main(string[] args) {
        String str = "Split the string on vowels and print each part";
        str = str.trim().toLowerCase();
        String[] arr = str.split("[aeiou]+");
        for(String st : arr){
            System.out.println(st);
        }
    }
}
