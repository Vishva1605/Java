package Encapsulation;

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name : "+name+" || Age : "+age);
    }
}
class Student extends Person{
    private int rollno;
    private String department;

    public Student(String name,int age,int rollno,String department){
        super(name, age);
        this.rollno = rollno;
        this.department = department;
    }
    void displayStudent(){
        System.out.println("Roll_No : "+rollno+" || Department : "+department);
    }
}
public class PersonStudentInfoSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Vishva",20,2216171,"CSE");
        s1.displayInfo();
        s1.displayStudent();
    }
}
// 1. Person-Student Info
// Parent Class: Person with name and age.

// Child Class: Student with roll number and department.

// Task: Create a student object and print all details.

