//Use both static and non-static methods in a class Student to manage student details and total student count.
class Student{
    String name;
    String rollno;
    int marks;
    static int count = 0;
    Student(String name,String rollno,int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        count++;
    }
    void details(){
        System.out.println(name+" : "+rollno+" : "+marks);
    }
}
public class StudentCount {
    public static void main(String[] args) {
        Student stu1 = new Student("ravi","2216171",97);
        Student stu2 = new Student("arun","2216182",45);

        stu1.details();
        stu2.details();

        System.out.println("student count : "+Student.count);
    }
}
