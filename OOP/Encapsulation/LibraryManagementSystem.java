package Encapsulation;
class Book{
    private String title;
    private String author;
    private int isbn;

    public Book(String title,String author,int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    int getIsbn(){
        return isbn;
    }
}
class Library{
    private Book[] books;
    private int count;

    public Library(){
        this.books = new Book[10];
        this.count = 0;
    }
    
    void addbook(Book b){
        if(count < 10){
            books[count++] = b;
        }else
            System.out.println("Maximum books reached");
    }
    void searchbook(String bookname){
        boolean found = false;
        for(int i=0;i<count;i++){
            if(books[i].getTitle() == bookname){
                found = true;
                System.out.println(bookname+" Book has been Found");
                break;
            }
        }
        if(!found){
            System.out.println(bookname+" Book Not Found");
        }
        System.out.println();
    }
    void librarybooks(){
        System.out.println("\t\t\sLibrary Books");
        for(int i=0;i<count;i++){
            System.out.println("Book_Name : "+books[i].getTitle()+" || Book_Author : "+books[i].getAuthor()+" || Books_Isbn : "+books[i].getIsbn());
        }
        System.out.println("-------------------------------------------");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("abc", "123", 101);
        Book b2 = new Book("bcd", "234", 201);
        Book b3 = new Book("cde", "345", 301);
        Book b4 = new Book("def", "456", 401);
        Book b5 = new Book("efg", "567", 501);
        Book b6 = new Book("fgh", "678", 601);
        Book b7 = new Book("ghi", "789", 701);
        Book b8 = new Book("hij", "890", 801);
        Book b9 = new Book("ijk", "012", 901);
        Book b10 = new Book("jkl", "246", 1001);
        Book b11 = new Book("klm", "121", 11101);

        Library l1 = new Library();

        l1.addbook(b1);l1.addbook(b2);l1.addbook(b3);l1.addbook(b4);l1.addbook(b5);l1.addbook(b6);l1.addbook(b7);l1.addbook(b8);l1.addbook(b9);l1.addbook(b10);l1.addbook(b11);l1.addbook(b8);

        l1.searchbook("cde");

        l1.librarybooks();
    }
}
// Book - Library

// Book: title, author, isbn

// Library: has an array/list of books

// Methods: addBook(), searchBook() by title.