package Encapsulation;
class Product{
    private String id;
    private String name;
    private double price;
    private int quantity;
    //constructor
    public Product(String id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    //getters
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    //setters
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    //method
    public double getTotalPrice(){
        return price*quantity;
    }
}

class Cart{
    private Product[] products = new Product[10];
    private int count = 0;

    public void addProduct(Product p,int quantity){
        p.setQuantity(quantity);
        products[count++] = p;
    }

    public void showCart(){
        System.out.println("Cart contents : ");
        for(int i=0;i<count;i++){
            System.out.println(products[i].getId()+" : "+products[i].getName()+" x "+products[i].getQuantity()+" = "+products[i].getTotalPrice());
        }
    }

    public double totalCost(){
        double total = 0;
        for(int i=0;i<count;i++){
            total += products[i].getTotalPrice(); 
        }
        return total;
    }
}


public class ShoppingCartSystems {
    public static void main(String[] args) {
        Product p1 = new Product("1","shampoo",2);
        Product p2 = new Product("2","paste",10);
        Product p3 = new Product("3","brush",20);

        Cart mycart = new Cart();

        mycart.addProduct(p1,5);
        mycart.addProduct(p2,3);
        mycart.addProduct(p3,2);

        mycart.showCart();

        System.out.println("Total Price in a Cart : " + mycart.totalCost());

    }
}
