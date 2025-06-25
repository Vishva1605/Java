public class StarPatternwhile{
    public static void main(string[] args) {
        int n = 4;
        int i=0;
        while(i<n){
            int j=i;
            while(j<3){
                System.out.print(" "+" ");
                j++;
            }
            int k = 0;
            while(k<i*2+1){
                System.out.print("*"+" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}