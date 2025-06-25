//works for rows below 
public class PascalLikePatternUsing11 {
    public static void main(string[] args) {
        int n=5;
        int mul = 1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            int temp = mul;
            int res;
            for(int k=0;k<i;k++){
                res = temp%10;
                System.out.print(res+" ");
                temp = temp/10;
            }
            mul = mul*11;
            System.out.println();
        }
    }
}
