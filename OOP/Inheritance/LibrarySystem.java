class Book{
    private String title;
    private String author;
    private double price;
    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}
class LibraryBook extends Book{
    private String location;
    private boolean isIssued;
    public LibraryBook(String title,String author,double price,String location){
        super(title,author,price);
        this.location = location;
        this.isIssued = false;
    }
    void displayBooks(){
    //     System.out.println("Title : "+getTitle()+" || Author : "+getAuthor()+" || Price : "+getPrice()+" || Location : "+location+" || IsIssued :"+isIssued);
        System.out.println("Title     : "+getTitle());
        System.out.println("Author    : "+getAuthor());
        System.out.println("Price     : Rs."+getPrice());
        System.out.println("Location  : "+location);
        System.out.println("Available : "+(isIssued?"Yes":"No"));
        System.out.println("------------------------------------");
}
}
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryBook l1 = new LibraryBook("Harry potter", "smith", 200, "chennai");
        LibraryBook l2 = new LibraryBook("The Legend", "saravana", 500, "paadi");

        l1.displayBooks();
        l2.displayBooks();
    }
}
// 6. Book-Library System
// Parent Class: Book with title, author, and price.

// Child Class: LibraryBook with location and isIssued.

// Task: Create and display details of library books.