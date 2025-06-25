abstract class Shape{
        abstract void area();
}
class Rectangle extends Shape{
    private int length;
    private int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("Area of Rectangle : "+length*breadth);
    }
}
class Circle extends Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.printf("Area of the Circle : %.2f%n",Math.PI*Math.pow(radius, 2));
    }
}
public class ShapeAreaAbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5,7);
        Shape s2 = new Circle(5.14);
        s1.area();s2.area();
    }
}
