public class PyramidStarPattern {
    public static void main(string[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(i*2)+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
