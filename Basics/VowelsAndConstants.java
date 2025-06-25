import java.util.Scanner;
class VowelsAndConstants {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char[] arr = str.toCharArray();
        int vowels = 0,consonants = 0;
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Total number of vowels : "+vowels);
        System.out.println("Total number of Consonants : "+consonants);
        sc.close();
    }
}