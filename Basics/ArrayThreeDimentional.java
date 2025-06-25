public class ArrayThreeDimentional {
    public static void main(string[] args) {
        int array[][][] = {{{1,2,3},{4,5,6}},{{6,5,4},{3,2,1},{9,8,7}}};
        for(int i=0;i<array.length;i++){
            System.out.println("Block : "+i);
            for(int j=0;j<array[i].length;j++){
                for(int k=0;k<array[i][j].length;k++){
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
