package Encapsulation;
class Book{
    private String title;
    private String author;
    private double price;
    Book(String title){
        this.title = title;
    }
    Book(String title,String author){
        this(title);
        this.author = author;
    }
    Book(String title,String author,double price){
        this(title,author);
        this.price = price;
    }
    void display(){
        if(title!=null)
            System.out.println("title "+title);
        if(author!=null)
            System.out.println("author "+author);
        if(price!=0.0)
            System.out.println("price "+price);
    }
}
public class BookConstructorChaining {
    public static void main(String[] args) {
        Book b1 = new Book("harry potter","smith");
        b1.display();
        
    }
}
