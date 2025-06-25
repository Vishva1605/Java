//Count the number of words in a sentence.

public class WordCountInSentence {
    public static void main(string[] args) {
        String str = " Count the number of words in a sentence. ";
        //System.out.println(Arrays.asList(str.split(" ")));
        String arr[] = str.trim().split(" ");
        System.out.println(arr.length);
    }
}
