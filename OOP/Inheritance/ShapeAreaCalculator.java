class Shape{
    void display(){
        System.out.println("shape ....");
    }
}
class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    void display(){
        int area = length * width;
        System.out.println("Area of Rectangle is : "+area);
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4,5);
        s1.display();
    }
}
// 7. Shape-Area Calculator
// Parent Class: Shape with method display().

// Child Class: Rectangle with length and width.

// Task: Calculate and display area using inheritance.