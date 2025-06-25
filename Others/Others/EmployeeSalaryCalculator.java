package Others.Others;
class Employee{
    public int totalsalary(int salary,int bonus){
        salary = salary + bonus;
        System.out.println("Total_Salary : "+salary);
        return salary;
    }
}
public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        int salary = 50000;
        int bonus = 2500;
        Employee obj1 = new Employee();
        obj1.totalsalary(salary, bonus);
    }   
}
