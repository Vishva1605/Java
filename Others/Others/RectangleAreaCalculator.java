package Others.Others;
class Rectangle{
    public int area(int length,int width){
        int area = length * width;
        return area;
    }
}
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        int length = 6;
        int width = 5;
        Rectangle obj1 = new Rectangle();
        System.out.println(obj1.area(length,width));
    }
}
