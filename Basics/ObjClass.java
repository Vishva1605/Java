class Student extends Object{
    private String name;
    private int rollno;
    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public String toString(){
        return "Name : "+name+" || Rollno : "+rollno;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null||getClass() != obj.getClass()) return false;
        Student that = (Student)obj;
        return this.name.equals(that.name) && this.rollno == that.rollno;
    }

}
public class ObjClass {
    public static void main(String[] args) {
        Student s1 = new Student("Vishva", 2216171);
        Student s2 = new Student("Vishva", 2216171);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
