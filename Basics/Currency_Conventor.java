class Calculator{
    public double INRtoUSD(double INR){
        return INR/86.13;
    }
    public double USDtoINR(double USD){
        return USD*86.13;
    }
    public void display(double INR,double USD){
        System.out.println("INR Rs."+INR+" to USD $."+INRtoUSD(INR));
        System.out.println("USD $."+USD+" to INR Rs."+USDtoINR(USD));
    }
}
public class Currency_Conventor {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.display(258.39, 5);
    }
}