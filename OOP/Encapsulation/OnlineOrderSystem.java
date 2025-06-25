package Encapsulation;
//online order system
class Order{
    private String name;
    private int quantity;
    private double price;
    //constructor
    // public Order(String itemname,int quantity,double priceperitem){
    //     this.name = itemname;
    //     this.quantity = quantity;
    //     this.price = priceperitem;
    // }
    //getters
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    //methods
    public void placeorder(String itemname,int quantity,double priceperitem){
        this.name = itemname;
        this.quantity = quantity;
        this.price = priceperitem;
        System.out.println("Order placed Successfully");
    }
    public void getordersummary(){
        System.out.println("Order Summary : ");
        System.out.println("itemname : "+name);
        System.out.println("quantity : "+quantity);
        System.out.println("Price : "+price);
        System.out.println("Total Cost : "+(quantity*price));
    }
    public void applycoupon(double percent){
        double total = quantity*price;
        double discount = (percent/100.0)*total;
        double finalprice = total-discount;
        System.out.println("Coupon applied : Rs."+discount);
        System.out.println("Total Cost : "+ finalprice);
    }


}
public class OnlineOrderSystem {
    public static void main(String[] args) {
        Order o1 = new Order();

        o1.placeorder("shampoo", 5, 1);
        o1.getordersummary();
        o1.applycoupon(5);
    }
}
