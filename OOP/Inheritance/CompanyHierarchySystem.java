class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Employee extends Person{
    private int empId;
    private String designation;
    Employee(String name,int age,int empId,String designation){
        super(name, age);
        this.empId = empId;
        this.designation = designation;
    }
    public int getEmpId() {
        return empId;
    }
    public String getDesignation() {
        return designation;
    }
}
class Manager extends Employee{
    private int teamSize;
    private String department;
    Manager(String name,int age,int empId,String designation,int teamSize,String department){
        super(name, age, empId, designation);
        this.teamSize = teamSize;
        this.department = department;
    }
    void showDetails(){
        System.out.println("\t\sDetails");
        System.out.println("--------------------------------");
        System.out.println("Name        : "+getName());
        System.out.println("Age         : "+getAge());
        System.out.println("Emp_Id      : "+getEmpId());
        System.out.println("Designation : "+getDesignation());
        System.out.println("Team Size   : "+teamSize);
        System.out.println("Department  : "+department);
        System.out.println("--------------------------------");
    }
}
public class CompanyHierarchySystem {
    public static void main(String[] args) {
        Manager m1 = new Manager("Vishva", 30, 1001, "Project Manager", 8, "Software");
        m1.showDetails();
    }
}
// Person – Base class

// Attributes: name, age

// Method: displayPerson()

// Employee – Inherits from Person

// Attributes: employeeId, designation

// Method: displayEmployee()

// Manager – Inherits from Employee

// Attributes: teamSize, department

// Method: displayManager()

