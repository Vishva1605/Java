//sum of rows and columns
public class ArraySumOfRowsAndCols {
    public static void main(string[] args){
        int n = 3;
        int m = 3;
        int array[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //rows
        int sum1 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(array[i][j] + " ");
                sum1 += array[i][j];
            }
           System.out.println();
           System.out.println("row "+ i +" : "+sum1);
        }
        System.out.println();
        //cols
        int sum2 = 0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(array[i][j] + " ");
                sum2 += array[i][j];
            }
            System.out.println();
            System.out.println("col "+ j +" : "+sum2);
        }
    }
}
