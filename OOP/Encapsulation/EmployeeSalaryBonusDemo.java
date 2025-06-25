package Encapsulation;
class Employee{
    private String name;
    private double salary;
    private int bonuspercentange;

    public Employee(String name,double salary,int bonuspercentange){
        this.name = name;
        this.salary = salary;
        this.bonuspercentange = bonuspercentange;
    }
    public String getname(){
        return name;
    }
    public double getsalary(){
        return salary;
    }
    public int getbonuspercentage(){
        return bonuspercentange;
    }

    void Totalsalary(){
        salary += (bonuspercentange/100.0)*salary;
        System.out.println("Total Salary of Employee "+name+" : "+"$"+salary);
    }
}
public class EmployeeSalaryBonusDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("vishva",50000,5);
        e1.Totalsalary();
    }
}
