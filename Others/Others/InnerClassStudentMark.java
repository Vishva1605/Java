package Others.Others;
class Student{
    private String name;
    Student(String name){
        this.name = name;
    }
    class Marks{
        private int M1,M2,M3;
        Marks(int M1,int M2,int M3){
            this.M1 = M1;
            this.M2 = M2;
            this.M3 = M3;   
        }
        void getTotal(){
                System.out.println("Student Name : "+name+" || Total Marks : "+M1+M2+M3);
            }
    }
}
public class InnerClassStudentMark {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit");
        Student.Marks m = s1.new Marks(45, 78, 100);
        m.getTotal();
    }
}
