public class UptoFiveTables {
    public static void main(string[] args) {
        int i = 1;
        while(i<=5){
            System.err.println(i+" Table");
            int j = 1;
            while(j<=10){
                System.out.println(i+" x "+j+ " = "+(i*j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
