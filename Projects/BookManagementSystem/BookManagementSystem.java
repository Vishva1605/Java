package BookManagementSystem;
    class Book {
    private String name;
    private String author;
    private boolean issued;

    public Book(String bookname, String bookauthor) {
        this.name = bookname;
        this.author = bookauthor;
        this.issued = false;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIssued() {
        return issued;
    }

    public boolean issueit() {
        issued = true;
        return true;
    }

    public boolean returnit() {
        issued = false;
        return true;
    }

    public void showdetails() {
        System.out.println("Book Name: " + name + ", Author: " + author + ", Issued: " + (issued ? "Yes" : "No"));
    }
}

// Library class
class Library {
    private Book[] books;
    private int count;

    public Library() {
        this.books = new Book[10];
        this.count = 0;
    }

    public void addbook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Can't add books anymore. Library is full.");
        }
    }

    public void issuebook(String bookname) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(bookname)) {
                found = true;
                if (!books[i].getIssued()) {
                    books[i].issueit();
                    System.out.println("Book issued: " + bookname);
                } else {
                    System.out.println("Book already issued: " + bookname);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + bookname);
        }
    }

    public void returnbook(String bookname) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getName().equals(bookname)) {
                found = true;
                if (books[i].getIssued()) {
                    books[i].returnit();
                    System.out.println("Book returned: " + bookname);
                } else {
                    System.out.println("Book was not issued: " + bookname);
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + bookname);
        }
    }

    public void showallbooks() {
        System.out.println("\nLibrary Book List:");
        for (int i = 0; i < count; i++) {
            books[i].showdetails();
        }
        System.out.println();
    }
}


// Main method
public class BookManagementSystem {
    public static void main(String[] args) {
        Library l1 = new Library();

        l1.addbook(new Book("Abc", "Vishva"));
        l1.addbook(new Book("Bcd", "Vishnu"));
        l1.addbook(new Book("Cdf", "Akash"));

        l1.showallbooks();

        l1.issuebook("Bcd");
        l1.issuebook("Bcd");
        l1.returnbook("Bcd");
        l1.returnbook("Bcd"); 
        l1.issuebook("Unknown"); 

        l1.showallbooks();
    }
}

