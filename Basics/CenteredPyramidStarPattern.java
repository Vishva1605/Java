public class CenteredPyramidStarPattern {
    public static void main(string args[]){
        for(int i=0;i<5;i++){
           for(int j=5-i;j>=0;j--){
                System.out.print("  ");
           }
           for(int k=0;k<(2*i)+1;k++){
            System.out.print('*'+ " ");
           }
            System.out.println();
        }
    }
}
