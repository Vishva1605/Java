package Encapsulation;
class Student{
    private String name;
    private String rollno;
    private int marks;

    public String getname(){
        return name;
    }
    public String getrollno(){
        return rollno;
    }
    public int getmarks(){
        return marks;
    }
    public void setname(String n,String r,int m){
        name = n;
        rollno = r;
        marks = m;
    }
}
public class StudentEncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setname("vishva","2216121",98);
        s2.setname("sanjai","2216173",87);
        System.out.println(s1.getname()+" : "+s1.getrollno()+" : "+s1.getmarks());
        System.out.println(s2.getname()+" : "+s2.getrollno()+" : "+s2.getmarks());

    }
}
