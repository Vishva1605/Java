package Encapsulation;
class Book{
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title,String author,String isbn,boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public String getisbn(){
        return isbn;
    }
    public boolean getisAvailable(){
        return isAvailable;
    }
    void borrowbook(){
        if(isAvailable){
            isAvailable = false;
            System.out.printf("%s Book has been Borrowed%n",title);
        }else{
            System.out.printf("%s Book has been Not Available%n",title);
        }
    }
    void returnbook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.printf("%s Book has been Returned%n",title);
        }else{
            System.out.printf("%s Book has Not Borrowed%n",title);
        }
    }

}
public class LibraryBookSystem {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter","vishva","hp1",true);
        b1.borrowbook();
        b1.borrowbook();
        b1.returnbook();
    }
}
