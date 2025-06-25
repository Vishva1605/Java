package Others.Others;
class Employee{
    protected final String companyname = "TCS";
}
final class User extends Employee{
    private String name;
    private double salary;
    User(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    void printdetails(){
        System.out.println("Name : "+name);
        System.out.println("Salary : Rs."+salary);
        System.out.println("Company : "+companyname);
    }
}
public class FinalKeywordDemo {
    public static void main(String[] args) {
        User u1 = new User("Vishva", 50000);
        u1.printdetails();
    }
}
