package Encapsulation;
class Student{
    private int id;
    private String name;

    public Student(int Student_Id,String Student_Name){
        this.id = Student_Id;
        this.name = Student_Name;
    }
    void registercourse(Course c){
        System.out.println("Student "+name+" ("+id+") "+"has registered for Course "+c.getsubject()+" ("+c.getcode()+") ");
        System.out.println();
    }
}
class Course{
    private int code;
    private String subject;

    public Course(int code,String subject){
        this.code = code;
        this.subject = subject;
    }
    public int getcode(){
        return code;
    }
    public String getsubject(){
        return subject;
    }   
}
public class StudentCourseRegistration {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vishva");
        Student s2 = new Student(102, "Vishnu");

        Course c1 = new Course(1601, "java");
        Course c2 = new Course(1602, "python");

        s1.registercourse(c1);
        s1.registercourse(c2);

        s2.registercourse(c2);
    }
}
// Student - Course

// Student class: name, id

// Course class: courseName, courseCode

// A method where student registers for a course.
