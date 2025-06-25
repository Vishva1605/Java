interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }
}
class Rectangle implements Shape{
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }
}
class ShapeAreaCalculator{
    public static void main(String[] args) {
        Shape s1 = new Circle(5.14);
        Shape s2 = new Rectangle(5,8);
        System.out.printf("Area of Circle : %.2f%n",s1.calculateArea());
        System.out.printf("Area of Rectangle : %.2f%n",s2.calculateArea());
    }
}