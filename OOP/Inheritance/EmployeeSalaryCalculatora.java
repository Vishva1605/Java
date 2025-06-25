class Employee{
    private String name;
    private int id;
    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
class Salary extends Employee{
    private double monthlySalary;
    private int bonusPercentage;
    public Salary(int id,String name,double monthlySalary,int bonusPercentage){
        super(id,name);
        this.monthlySalary = monthlySalary;
        this.bonusPercentage = bonusPercentage;
    }
    void annualSalary(){
        double anualSalary = monthlySalary*12;
        double bonusSalary = bonusPercentage/100.0 * anualSalary;
        double total = anualSalary + bonusSalary;
        System.out.println("Total Annual Salary of "+getName()+"("+getId()+") is Rs."+total);
    }
}
public class EmployeeSalaryCalculatora {
    public static void main(String[] args) {
        Salary s1 = new Salary(101, "Vishva", 50000, 5);
        Salary s2 = new Salary(102, "Akash", 60000, 6);

        s1.annualSalary();
        s2.annualSalary();
    }
}
// 3. Employee-Salary
// Parent Class: Employee with name and id.

// Child Class: Salary with monthlySalary and bonus.

// Task: Calculate and print total annual salary.