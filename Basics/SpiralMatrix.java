import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4},{4,5,6,4},{7,8,9,4},{1,2,3,4}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int I = sc.nextInt();
        System.out.print("Enter Number Of Cols : ");
        int J = sc.nextInt();
        int[][] arr = new int[I][J];
        for(int i=0;i<I;i++){
            for(int j=0;j<J;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int rowstart = 0;
        int rowend = arr.length-1;
        int colstart = 0;
        int colend = arr[0].length-1;
        while(rowstart<=rowend && colstart<=colend){
            for(int col = colstart;col<=colend;col++)
                System.out.print(arr[rowstart][col]+" ");
            // System.out.println();
            rowstart++;
            for(int row=rowstart;row<=rowend;row++)
                System.out.print(arr[row][rowend]+" ");
            // System.out.println();
            colend--;
            if(rowstart<=rowend){
                for(int col=colend;col>=colstart;col--)
                    System.out.print(arr[rowend][col]+" ");
                // System.out.println();
                rowend--;
            }
            if(colstart<=colend){
                for(int row=rowend;row>=rowstart;row--)
                    System.out.print(arr[row][colstart]+" ");
                // System.out.println();
                colstart++;
            }
        }
        sc.close();
    }
}
