import java.util.Scanner;
class Person{
    protected String name;
    Person(String name){
        this.name = name;
    }
    void print(){
        System.out.println("Name : "+name);
    }
}
class Student extends Person{
    private int rollno;
    Student(String name,int rollno){
        super(name);
        this.rollno = rollno;
    }
    @Override
    void print(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
    }
}
public class SuperWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student : ");
        String st1 = sc.nextLine();
        System.out.print("Enter Student RollNo : ");
        int r1 = sc.nextInt();
        Student s1 = new Student(st1,r1);
        s1.print();
        sc.close();
    }
}
