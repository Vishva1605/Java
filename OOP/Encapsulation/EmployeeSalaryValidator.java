package Encapsulation;

class Employee{
        private String name;
        private double salary;
        Employee(String name){
            this.name = name;
            this.salary = 0.0;
        }
        void setSalary(double Salry){
            this.salary = Salry;
        }
        void getSalary(){
            if(salary>=10000){
                System.out.println("Salary of Rs."+this.salary+" creadited to Mr."+name);
            }else{
                System.out.println("Salary must me atleast 10000 or above");
            }
        }
    }
    public class EmployeeSalaryValidator {
        public static void main(String[] args) {
            Employee e1 = new Employee("Vishva");
            e1.setSalary(40000);
            e1.getSalary();
        }
    }
