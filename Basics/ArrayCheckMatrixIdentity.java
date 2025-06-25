public class ArrayCheckMatrixIdentity{
    public static void main(string[] args) {
        int array[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int n = array.length;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        boolean identity = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(array[i][j] != 1 && i == j){
                    identity = false;
                    break;
                }else if(array[i][j] != 0 && i!=j){
                    identity = false;
                    break;
                }
            }
            if(!identity){
                break;
            }
        }
        if(identity){
            System.out.println("given Matrix is Identity");
        }else{
            System.out.println("given Matrix is not Identity");
        }
    }
}
