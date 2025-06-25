abstract class Person{
    Person(){
        System.out.println("Person Created");
    }
    abstract void display();
}
class Student extends Person{
    Student(){
        super();//super keyword called automatically dont need to mention a emty super class;
    }
    void display(){
        System.out.println("Student Details Displayed");
    }
}
public class PersonStudentAbstractDemo {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.display();
    }
}
