class calculator{
    public int add(int  n1,int n2){
        return n1 + n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class CalculatorOverloadDemo {
    public static void main(String[] args) {
        calculator calc = new calculator();
        int result = calc.add(2,3);
        System.out.println(result);
    }
}
