package OnlineShoppingSystem;
import java.util.Scanner;

// E-Commerce Order Management
class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int product_Id, String product_Name, double product_price) {
        this.id = product_Id;
        this.name = product_Name;
        this.price = product_price;
        quantity = 0;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Cart {
    private Product[] products;
    private int count;

    public Cart() {
        products = new Product[10];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public Product[] getProducts() {
        return products;
    }

    void addproduct(Product p, int quantity) {
        if (count < products.length) {
            p.setQuantity(quantity);
            products[count++] = p;
            System.out.printf("Product '%s' Added to Cart Successfully", p.getName());
        } else
            System.out.println("Cart Reached Maximum Products");
        System.out.println();
    }

    void viewcart() {
        System.out.println("        List of Products in Cart        ");
        for (int i = 0; i < count; i++) {
            System.out.println("Product_Id : " + products[i].getID());
            System.out.println("Product_name : " + products[i].getName());
            System.out.println("Product_Price : " + products[i].getPrice());
            System.out.println("Product_Quantity : " + products[i].getQuantity());
            System.out.println("Total_Price_of_Product : " + (products[i].getPrice() * products[i].getQuantity()));
            System.out.println("-------------------------------------------------------");
        }
    }
}

class Order {
    private Cart c;
    private Product[] orderedproducts;

    public Order(Cart c) {
        this.c = c;
        this.orderedproducts = c.getProducts();
    }

    void totalprice() {
        double price = 0;
        for (int i = 0; i < c.getCount(); i++) {
            price += orderedproducts[i].getPrice() * orderedproducts[i].getQuantity();
        }
        System.out.println("Total price In Your Cart is : Rs." + price);
        System.out.println();
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Online Shopping System");
        System.out.println("=======================================");
        System.out.print("Enter number of products to add (max 3): ");
        int n = sc.nextInt();

        Product[] allProducts = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            allProducts[i] = new Product(id, name, price);
        }

        Cart myCart = new Cart();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter quantity for " + allProducts[i].getName() + ": ");
            int qty = sc.nextInt();
            myCart.addproduct(allProducts[i], qty);
        }

        System.out.println();
        myCart.viewcart();

        Order order = new Order(myCart);
        order.totalprice();

        sc.close();
    }
}
