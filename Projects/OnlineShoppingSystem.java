
//E-Commerce Order Management
class Product{
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int product_Id,String product_Name,double product_price){
        this.id = product_Id;
        this.name = product_Name;
        this.price = product_price;
        quantity = 0;
    }

    public int getID(){
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

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
class Cart{
    private Product[] products;
    private int count;

    public Cart(){
        products = new Product[10];
        count = 0;
    }
    public int getCount(){
        return count;
    }
    public Product[] getProducts(){
        return products;
    }

    void addproduct(Product p,int quantity){
        if(count<products.length){
            p.setQuantity(quantity);
            products[count++] = p;
            System.out.printf("Product '%s' Added to Cart Successfully",p.getName());
        }else
            System.out.println("Cart Reached Maximum Products");
        System.out.println();
    }

    void viewcart(){
        System.out.println("        List of Products in Cart        ");
        for(int i=0;i<count;i++){
            System.out.println("Product_Id : "+products[i].getID());
            System.out.println("Product_name : "+products[i].getName());
            System.out.println("Product_Price : "+products[i].getPrice());
            System.out.println("Product_Quantity : "+products[i].getQuantity());
            System.out.println("Total_Price_of_Product : "+(products[i].getPrice()*products[i].getQuantity()));
            System.out.println("-------------------------------------------------------");
        }
    }
}
class Order{
    private Cart c;
    private Product[] orderedproducts;

    public Order(Cart c){
        this.c = c;
        this.orderedproducts = c.getProducts();
    }

    void totalprice(){
        double price = 0;
        for(int i=0;i<c.getCount();i++){
            price += orderedproducts[i].getPrice() * orderedproducts[i].getQuantity();
        }
        System.out.println("Total price In Your Cart is : Rs."+price);
        System.out.println();
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Shampoo", 2);
        Product p2 = new Product(102, "paste", 10);
        Product p3 = new Product(103,"brush",20);

        Cart myCart = new Cart();
        myCart.addproduct(p1, 10);
        myCart.addproduct(p2, 1);
        myCart.addproduct(p3, 4);

        myCart.viewcart();

        Order ok = new Order(myCart);
        ok.totalprice();
    }
}
