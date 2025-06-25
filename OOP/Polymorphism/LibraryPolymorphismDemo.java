class Book{
    private String title;
    private String author;
    private double price;
    
    Book(String title,String author,double price){
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
    void showDetails(){
        System.out.println("\tBook Details");
        System.out.println("--------------------------");
        System.out.println("Book_Title : "+title);
        System.out.println("Book_Author : "+author);
        System.out.println("Book_Price : Rs."+price);
        System.out.println("--------------------------");
    }
}
class User{
    private int id;
    private String name;
    User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    void displayInfo(){
        System.out.println("\tUser Details");
        System.out.println("User_Id : "+id);
        System.out.println("User_Name : "+name);
        System.out.println();
    }
}
class StudentUser extends User{
    private int borrowedBooksCount;
    StudentUser(int id,String name,int borrowedBooksCount){
        super(id, name);
        this.borrowedBooksCount = borrowedBooksCount;
    }
    @Override
    void displayInfo(){
        System.out.println("\tStudentUser Details");
        System.out.println("User_Id : "+getId());
        System.out.println("User_Name : "+getName());
        System.out.println("Borrowed_Books_Count : "+borrowedBooksCount);
        System.out.println();
    }
}
class FacultyUser extends User{
    private String department;
    FacultyUser(int id,String name,String department){
        super(id, name);
        this.department = department;
    }
    @Override
    void displayInfo(){
        System.out.println("\tStudentUser Details");
        System.out.println("User_Id : "+getId());
        System.out.println("User_Name : "+getName());
        System.out.println("Department : "+department);
        System.out.println();
    }
}
public class LibraryPolymorphismDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Harry potter", "Harry", 350);
        StudentUser s1 = new StudentUser(101,"Vishva", 3);
        FacultyUser f1 = new FacultyUser(102, "Vishnu", "IT");
        b1.showDetails();
        s1.displayInfo();
        f1.displayInfo();
    }
}
// ✅ Practice 1: Library System
// Goal: Manage books and users in a library.

// 📦 Class Structure:
// Book (encapsulated):

// title, author, price → all private

// Getters/setters

// Method: showDetails()

// User (base class):

// name, userId

// Method: displayInfo()

// StudentUser (inherits from User)

// borrowedBooksCount

// Override displayInfo() to include count

// FacultyUser (inherits from User)

// department

// Override displayInfo() to include department

// 🎯 Create one StudentUser and one FacultyUser and print their info.