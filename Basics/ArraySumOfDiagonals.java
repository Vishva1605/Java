//sum of diagonals in a square Matrix
public class ArraySumOfDiagonals {
    public static void main(string[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = array.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        //sum of left diagonals
        int sum1 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i == j){
                    sum1 = sum1 + array[i][j];
                }
            }
        }
        System.out.println("Sum of Left Diagonal : "+ sum1);
        //sum of right diagonals
        int sum2 = 0;
        int j=n-1;
        for(int i=0;i<n;i++){
            while(j>=0){
                sum2= sum2+array[i][j];
                j--;
                break;
            }
        }
        System.out.println("Sum of Right Diagonals : "+sum2);
        int result = sum1+sum2;
        System.out.println("Sum of Both Diagonals : "+result);
    }
}
