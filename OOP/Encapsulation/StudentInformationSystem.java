package Encapsulation;
class Student{
    private String name;
    private int rollno;
    private String department;

    public Student(String name,int rollno,String department){
        this.name = name;
        this.rollno = rollno;
        this.department = department;
    }

    void Studentdetails(){
        System.out.println("\t\t STUDENT DETAILS \t\t");
        System.out.println("Student Name : "+name);
        System.out.println("Student RollNo : "+rollno);
        System.out.println("Student Department : "+department);
        System.out.println("--------------------------------------------------------");
    }
}
public class StudentInformationSystem {
    public static void main(String[] args) {
        Student s1 = new Student("vishva", 2216171, "CSE");
        Student s2 = new Student("Shyam", 2216172, "IT");
        Student s3 = new Student("Arun",2216173,"ECE");
        
        s1.Studentdetails();
        s2.Studentdetails();
        s3.Studentdetails();
        
    }
}
// Student Information

// Fields: name, rollNumber, department

// Write setters and getters.

// Print student details.
