public class RightAlignedTrianglePattern {
    public static void main(string[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");//2 space kuduthathunala than stars ku naduvula space kuduka mudinjithu
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
