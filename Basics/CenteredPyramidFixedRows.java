public class CenteredPyramidFixedRows {
    public static void main(string[] args) {
        int row = 5;
        for(int i = 0;i<row;i++){
            for(int j = row-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int k= 0;k<(i*2)+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
