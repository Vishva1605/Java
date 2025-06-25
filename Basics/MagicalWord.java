public class MagicalWord {
    public static void main(String[] args) {
        String S = "Ankur".toUpperCase();
        String T = "teacher".toUpperCase();
        char[] a = S.toCharArray();
        char[] b = T.toCharArray();
        int sum1 = 1,sum2=1;
        for(int i=0;i<a.length;i++){
            int ch = a[i];
            sum1 = sum1 * (ch-64);
        }
        for(int i=0;i<b.length;i++){
            int ch = b[i];
            sum2 = sum2 * (ch-64);
        }
        boolean found = sum1%47 == sum2%47;
        if(found){
            System.out.println("Chosen");
        }else{
            System.out.println("Not Chosen");
        }
    }
}
