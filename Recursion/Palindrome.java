public class Palindrome {
    public static boolean ispali(String s,int start,int end){
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return ispali(s,start+1,end-1);
    }
    public static void main(String[] args){
        String s = "avssva";
        System.out.println(ispali(s,0,s.length()-1));
    }
}
