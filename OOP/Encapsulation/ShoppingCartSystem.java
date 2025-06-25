package Encapsulation;
class Product{
    private String name;
    private double price;

    public Product(String Product_Name,double Product_price){
        this.name = Product_Name;
        this.price = Product_price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

}
class Order{
    private Product[] products;
    private int count;

    public Order(){
        this.products = new Product[10];
        this.count = 0;
    }
    public int getCount(){
        return count;
    }
    public Product[] getProducts(){
        return products;
    }

    void addproduct(Product p){
        if(count<10){
            products[count++] = p;
            System.out.println("product : "+p.getName()+" || Price : Rs."+p.getPrice()+" Added to Cart");
        }
        System.out.println();
    }
    void showdetails(){
        System.out.println("\t\tFinal Bill");
        for(int i=0;i<count;i++){
        System.out.println("Product_Name : "+products[i].getName()+" || Product_Price : Rs."+products[i].getPrice());
        }
        System.out.println();
    }
}
class Cart{
    private Order o;
    private Product[] products;

    public Cart(Order o){
        this.o = o;
        this.products = o.getProducts();
    }
    void getTotal(){
        double Total = 0;
        for(int i=0;i<o.getCount();i++){
            Total += products[i].getPrice();
        }
        System.out.println("Total Price : Rs."+Total);
        System.out.println();
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("chair", 200);
        Product p2 = new Product("chain",300);
        Product p3 = new Product("Glass",250);

        Order o = new Order();
        o.addproduct(p1);
        o.addproduct(p2);
        o.addproduct(p3);

        o.showdetails();

        Cart c = new Cart(o);
        c.getTotal();
    }
}
