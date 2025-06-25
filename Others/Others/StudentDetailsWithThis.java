package Others.Others;
class Student{
    private String name;
    private int rollno;
    private String department;
    Student(String name,int rollno,String department){
        this.name = name;
        this.rollno = rollno;
        this.department = department;
    }
    void display(){
        System.out.println("Details");
        System.out.println("Name : "+name);
        System.out.println("ROllNo : "+rollno);
        System.out.println("Department : "+department);
    }
}
public class StudentDetailsWithThis {
    public static void main(String[] args) {
        Student s1 = new Student("vishva", 2216171, "CSE");
        s1.display();
    }
}
