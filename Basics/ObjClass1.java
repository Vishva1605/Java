class Product extends Object{
    private String name;
    private int id;
    private double price;
    Product(String name,int id,double price){
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public String toString(){
        return "Product Name : "+this.name+" || Product Id : "+this.id+" || Product Price : "+this.price;
    }
    public boolean equals(Object Obj){
        if(this == Obj) return true;
        if(Obj == null || getClass() != Obj.getClass()) return false;
        Product that = (Product) Obj;
        return this.name.equals(that.name) && this.id == that.id;
    }

}
public class ObjClass1 {
    public static void main(String[] args) {
        Product p1 = new Product("chair", 101, 251);
        Product p2 = new Product("chair", 101, 250);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getClass());
        System.out.println(p2.getClass());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
