package Others.Others;
import java.util.Scanner;
class student {
    long rollno;
    String name;
    int Marks;
    
}public class StudentArrayObjectDemo {
    public static void main(String[] args) {
        student s1 = new student();
        s1.rollno = 2216171;
        s1.name = "Ravi";
        s1.Marks = 87;
        student s2 = new student();
        s2.rollno = 2216172;
        s2.name = "sanjai";
        s2.Marks = 83;
        Scanner sc = new Scanner(System.in);
        student students[] = new student[2];
        students[0] = s1;
        students[1] = s2;
        // for(int i=0;i<students.length;i++){
        //     System.out.print("Roll_no : ");
        //     students[i].rollno = sc.nextLong();
        //     System.out.print("Name : ");
        //     sc.nextLine();
        //     students[i].name = sc.nextLine();
        //     System.out.print("Marks : ");
        //     students[i].Marks = sc.nextInt();
        // }
        for(student stud : students){
            System.out.println(stud.rollno);
            System.out.println(stud.name);
            System.out.println(stud.Marks);
            System.out.println();
        }
        sc.close();
    }
}
