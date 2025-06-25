package Others.Others;
class School{
    static int schoolcode = 8889;
    static class Teacher{
        void show(){
            System.out.println("School_Code : "+schoolcode);
        }
    }
}
public class StaticNestedClass{
    public static void main(String[] args) {
        School.Teacher s1 = new School.Teacher();
        s1.show();
    }
}