//maximum element in array
public class Array_Maximum {
    public static void main(string[] args) {
        int r = 3;
        int c = 3;
        int array[][] = new int[3][3];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int max = array[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                while(max<array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maximum : "+max);
    }
}
