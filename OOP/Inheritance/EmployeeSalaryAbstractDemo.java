abstract class Employee {
    protected String name;
    Employee(String name) {
        this.name = name;
    }
    abstract void calculateSalary();
}

final class FullTimeEmployee extends Employee {
    private double monthlySalary;
    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    void calculateSalary() {
        System.out.println("Total Annual Salary of " + name + " is Rs." + monthlySalary * 12);
    }
}

final class PartTimeEmpoloyee extends Employee {
    private double hourlyRate;
    private double hrsWorked;
    PartTimeEmpoloyee(String name, double hourlyRate, double hrsWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }
    void calculateSalary() {
        double salary = hourlyRate * hrsWorked;
        System.out.println("Part Time Salary for " + name + " is Rs." + salary);
    }
}

public class EmployeeSalaryAbstractDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ravi", 50000);
        Employee e2 = new PartTimeEmpoloyee("Ravi", 300, 5.30);
        e1.calculateSalary();
        e2.calculateSalary();
    }
}
