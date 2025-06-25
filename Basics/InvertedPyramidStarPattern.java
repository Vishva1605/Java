public class InvertedPyramidStarPattern {
    public static void main(string[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<((n-i)*2)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}