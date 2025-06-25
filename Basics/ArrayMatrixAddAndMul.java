public class ArrayMatrixAddAndMul {
    public static void main(String[] args) {
        int mat1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat2[][] = {{9,8,7},{6,5,4},{3,2,1}};
        //printing 1st matrix
        System.err.println("1st Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //printing second matrix
        System.err.println("2nd Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //performing matrix addition
        System.out.println("Matrix Adition");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int sum = mat1[i][j] + mat2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        System.out.println();
        //performing matrix multiplication
        System.out.println("Matrix Multiplicaation");
        int res = 0;
        // int mul = 0;
        for(int p=0;p<3;p++){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    res = res + mat1[p][j] * mat2[j][i];
                    // mul = mul + res;
                }
                System.out.print(res+" ");
                res = 0;
                // mul = 0;
            }
            System.out.println();
        } 
    }
}
