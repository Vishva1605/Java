package Encapsulation;
class Book{
    private String title;
    private boolean issued;
//constructor
    public Book(String title){
        this.title = title;
        this.issued = false;
    }
//getters
    public String getTitle(){
        return title;
    }
    public boolean getIssued(){
        return issued;
    }
//methods
    public boolean isAvailable(){
        System.out.println(!issued);
        return !issued;
    }
    public void issuebook(){
        if(isAvailable()){
            issued = true;
            System.out.println(title+" Book Issued");
        }else
            System.out.println(title+" Book already Issued");
        System.out.println();
    }
    public void returnbook(){
        if(!isAvailable()){
            issued = false;
            System.out.println(title+" Book Returned");
        }else
            System.out.println(title+" Book Not Returned yet");
        System.out.println();
    }
    public void getdetails(){
        System.out.println("Book Information");
        System.out.println("-----------------");
        System.out.println("Book Name : "+title);
        System.out.println("Is Available : "+(isAvailable()?"Yes":"No"));
        System.out.println();
    }
}
public class BookIssueReturnApp {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter");
        Book b2 = new Book("The Legend");
        
        b1.isAvailable();
        b1.issuebook();
        b1.returnbook();
        b1.getdetails();

        b2.isAvailable();
        b2.issuebook();
        b2.returnbook();
        b2.getdetails();
    }
}
