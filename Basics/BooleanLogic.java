public class BooleanLogic {
    public static void main(string[] args) {
        int num1 = 4;
        int num2 = 5;
        int x = 9;
        int y = 10;

        boolean a = num1<num2 && x < y;
        boolean b = num1>num2 && x > y;
        boolean c = num1<num2 && x > y;
        boolean d = num1>num2 && x < y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        boolean e = num1<num2 || x < y;
        boolean f = num1>num2 || x > y;
        boolean g = num1<num2 || x > y;
        boolean h = num1>num2 || x < y;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(!h);
    }
}
