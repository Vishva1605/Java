package Others.Others;
//understanding from teaching

class student{
    long rollno;
    String name;
    int marks;
    public void s1(){
        rollno = 2216171;
        name = "vishva";
        marks = 87;
    }
    public void s2(){
        rollno = 2216172;
        name = "sanjai";
        marks = 83;
    }
}
public class StudentArrayDemo {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.s1();
        s2.s2();
        student students[] = {s1,s2};
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno+" "+students[i].name+" "+students[i].marks);
        }
    }
}
