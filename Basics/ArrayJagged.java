public class ArrayJagged {
    public static void main(string[] args) {
        int jagged[][][] = new int[2][][];//assigning blocks

        jagged[0] = new int[3][];
        jagged[1] = new int[2][];//assiging rows

        jagged[0][0] = new int[4];
        jagged[0][1] = new int[3];
        jagged[0][2] = new int[2];//assigning col for block 0

        jagged[1][0] = new int[3];
        jagged[1][1] = new int[2];//assigning col for block 1

        for(int i=0;i<jagged.length;i++){
            System.out.println("block : "+i);
            for(int j=0;j<jagged[i].length;j++){
                for(int k=0;k<jagged[i][j].length;k++){
                    int digit = (int)(Math.random()*10);
                    System.out.print(digit+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
