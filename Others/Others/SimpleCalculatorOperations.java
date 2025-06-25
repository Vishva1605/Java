package Others.Others;
class simplecalculator{
    public int add(int a,int b){
        int value = a + b;
        System.out.println("Added : "+value);
        return value;
    }
    public int sub(int a,int b){
        int value = a - b;
        System.out.println("Subracted : "+value);
        return value;
    }
    public int mul(int a,int b){
        int value = a * b;
        System.out.println("Multiplied : "+value);
        return value;
    }
    public int div(int a,int b){
        if(b!=0){
        int value = a/b;
        System.out.println("Divided : "+value);
        return value;
        }else{
            System.out.println("cannot be divided");
            return 0;
        }
    }
}
public class SimpleCalculatorOperations {
    public static void main(String[] args) {
    int a = 7;
    int b = 8;
   
    simplecalculator calc = new simplecalculator();
    calc.add(a,b);
    calc.sub(a,b);
    calc.mul(a,b);
    calc.div(a,b);
    }
}
