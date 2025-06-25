package Others.Others;
class student{
    public void display(String name,int age,char grade){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("grade : "+grade);
    }
}
public class StudentInfoDisplay {
    public static void main(String[] args) {
        String name = "john";
        int age = 18;
        char grade = 'A';
        student obj1 = new student();
        obj1.display(name,age,grade);

    }
}
