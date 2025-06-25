package Encapsulation;
class Product{
    private int id;
    private String name;
    private double price;
    private double discount;

    public Product(int product_Id,String product_Name,double product_price){
        this.id = product_Id;
        this.name = product_Name;
        this.price = product_price;
        this.discount = 0;
    }
    
    void applydiscount(int percent){
        discount = percent/100.0 * price;
        System.out.println("Discount Applied of Rs."+discount+" for Product "+name);
        System.out.println();
    }

    void showdetails(){
        System.out.println("\t\tProduct Details");
        System.out.println("Product ID : "+id);
        System.out.println("Product Name : "+name);
        System.out.println("Product Price : Rs."+price);
        System.out.println("Discount : Rs."+discount);
        System.out.println("Total Price : Rs."+(price-discount));
        System.out.println("-------------------------------------------");
    }
}
public class ProductDiscountSystem {
    public static void main(String[] args) {
        Product p1 = new Product(100,"chair",90);
        Product p2 = new Product(101,"chain",80);

        p1.applydiscount(5);
        p2.applydiscount(10);

        p1.showdetails();
        p2.showdetails();
    }
}
// Product Details

// Fields: id, name, price

// Create a method to apply discount.