package Encapsulation;
class Rectangle{
    private int length;
    private int width;

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setMeasures(int L,int W){
        length = L;
        width = W;
    }
    void Area(){
        System.out.println("Area of Rectangle : "+(length*width));
    }
}
public class RectangleAreaEncapsulation {
    public static void main(String[] args) {
        Rectangle calc = new Rectangle();
        calc.setMeasures(8,5);

        calc.Area();
    }
}
