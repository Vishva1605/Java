//traanspose of a matrix
public class ArrayTranspose {
    public static void main(string[] args) {
        int array[][] = {{2,3,4},{5,6,7},{8,9,1}};
        System.out.println("original Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int transpose[][] = new int[3][3];
        System.out.println("Transpose Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[j][i] = array[i][j];
                System.out.print(array[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
