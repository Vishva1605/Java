//90 degree rotation of a matrix
public class Array90degreerotation{
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }  
        System.out.println();
        //90 degree rotation
        System.out.println("90 degree rotation");
        for(int j=0;j<3;j++){
            for(int i=2;i>=0;i--){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

    }
}