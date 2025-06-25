package Encapsulation;
class Employee{
    private String name;
    private double salary;

    public Employee(String Employee_name){
        this.name = Employee_name;
    }
    void setsalary(double Employee_salary){
        if(Employee_salary>=10000){
            this.salary = Employee_salary;
            System.out.println("Salary of Rs."+salary+" Credited to Employee "+name);
        }else{
            System.out.println("Salaray Must be greater than Rs.10000");
        }
    }
    void getsalary(double amount){
        if(amount>0 && amount<=this.salary){
            this.salary -= amount;
            System.out.println("Salary Amount of Rs."+amount+" Retrived by Employee "+name);
        }else{
            System.out.println("Insufficient Balance");
        }
        System.out.println();
    }
}
public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishva");
        e1.setsalary(1000);
        e1.setsalary(14000);
        e1.getsalary(3000);
    }
}
