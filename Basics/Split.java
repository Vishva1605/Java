public class Split{
    public static void main(string[] args) {
        String str= "hai hello my name is vishva";
        String vowels = "[^aeiouAEIOU]";
        String result[] = str.split(vowels);
        for(String val: result){
        System.out.print(val);
        }
    }
}