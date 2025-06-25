public class ArrayIdentityMatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 0, 0 }, { 0, 1, 3 }, { 0, 0, 1 } };
        boolean res = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j && a[i][j] == 1) {
                    res = true;
                }
                else if (a[i][j] == 0 && i != j) {
                    res = true;
                }
                else {
                    res = false;
                    break;
                }
            }
            if (!res) {
                break;
            }
        }
        System.out.println(res ? "YES" : "NO");
    }
}
