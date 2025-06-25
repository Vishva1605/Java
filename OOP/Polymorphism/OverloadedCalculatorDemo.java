class Calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class OverloadedCalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition : "+calc.add(6.0,7));
    }
}
// Create a class Calculator with an overloaded method add() that works for:

// Two integers

// Two doubles

// Three integers