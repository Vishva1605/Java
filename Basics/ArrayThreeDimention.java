//printing random numbers in 3d array with fixed sizes
public class ArrayThreeDimention {
    public static void main(string[] args) {
        int array[][][] = new int [3][4][5];
        for(int i=0;i<array.length;i++){
            System.out.println("Block : "+i);
            for(int j=0;j<array[i].length;j++){
                for(int k=0;k<array[i][j].length;k++){
                    int digit = (int)(Math.random()*10);
                    System.out.print(digit+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
