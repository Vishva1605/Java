public class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "hai my name is vishva";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Count of Vowels: " + vowels);
        System.out.println("Count of Consonants: " + consonants);
    }
}
