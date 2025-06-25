class computer{
    int price;
    String brand;
    //static String type = "Laptop"; or
    static String type;
    public void show(){
        System.out.println(brand+":"+price+":"+type);
    }
    //creating a static method
    static void show1(computer comp1){
        //System.out.println(brand+":"+price+":"+type);//we cant use a non-static variable inside the static method directly so,
        System.out.println(comp1.brand+":"+comp1.price+":"+type);//indirectly refering obj to print
    }
}
public class StaticMethod {
    public static void main(String[] args){
        computer.type = "Laptop";

        computer comp1 = new computer();
        comp1.price = 50000;
        comp1.brand = "Lenovo";
        //comp1.type = "Laptop";

        computer comp2 = new computer();
        comp2.price = 60000;
        comp2.brand = "HP";
        //comp2.type = "Laptop"; Instead of using type for all obj create a static variable

        comp1.show();
        comp2.show();

        computer.show1(comp1);
    }
}
