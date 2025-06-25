public class CompactPyramidPattern {
    public static void main(String[] args) {
        int row = 4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
