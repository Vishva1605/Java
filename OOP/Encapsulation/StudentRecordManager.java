package Encapsulation;
class Student{
    private String name;
    private int rollno;
    private char grade;

    public Student(String name, int rollno, char grade){
        this.name = name;
        this.rollno = rollno;
        this.grade = Character.toUpperCase(grade);
    }

    public String getName(){
        return name;
    }

    public int getRollno(){
        return rollno;
    }

    public char getGrade(){
        return grade;
    }

    void display(){
        System.out.println(name + " : " + rollno + " : " + grade);
    }
}

public class StudentRecordManager {
    public static void main(String[] args) {
        Student s1 = new Student("ravi", 2216171, 'a');
        Student s2 = new Student("sanjai", 2216172, 'b');
        Student s3 = new Student("Akash", 2216173, 'c');

        s1.display();
        s2.display();
        s3.display();
    }
}
