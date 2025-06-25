class Shape {
    void area() {
        System.out.println("Shape has area");
    }

    // Overloaded methods
    void area(int side) {
        System.out.println("Square has area : " + (side * side));
    }

    void area(int length, int width) {
        System.out.println("Rectangle (Overloaded) has area : " + (length * width));
    }
}

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Circle has area : " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    private int l;
    private int b;

    Rectangle(int length, int breadth) {
        this.l = length;
        this.b = breadth;
    }

    @Override
    void area() {
        System.out.println("Rectangle has area : " + (l * b));
    }
}

public class ShapeAreaCalculatar {
    public static void main(String[] args) {
        // Overridden area() methods using polymorphism
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(3, 5);
        s1.area();
        s2.area();

        // Overloaded area() methods
        Shape s3 = new Shape();
        s3.area(4);           // Square
        s3.area(4, 6);        // Rectangle (again, via overloading)
    }
}
