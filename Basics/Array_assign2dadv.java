//assign random numbers to 2d array using enhanced for loop
public class Array_assign2dadv {
    public static void main(string[] args) {
        int num[][] = new int[3][4];
        int i = 0;
        for(int row[] : num){
            int j = 0;
            for(int col :row){
                System.out.print(col);
                num[i][j] = (int)(Math.random() * 10);
                j++;
            }
            System.out.println();
            i++;
        }
        for(int row[] : num){
            for(int val : row){
                System.out.print(val +" ");
            }
            System.out.println();
        }
    }
}
//li8 ta manda kolambuthu -_-;