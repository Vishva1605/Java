package Others.Others;
class Circle{
    double pi = 3.14;
    public double area(double radius){
        double result = pi * radius * radius;
        System.out.println("Area : "+ result);
        return result;
    }
    public double circumference(double radius){
        double result = 2 * pi * radius;
        System.out.println("Circumference : "+ result);
        return result;
    }
}
public class CircleCalculation{
    public static void main(String []args){
        double radius = 5;
        Circle calc = new Circle();
        calc.area(radius);
        calc.circumference(radius);
    }
}