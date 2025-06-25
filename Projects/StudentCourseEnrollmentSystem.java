
class Student{
    private String name;
    private Course[] courses;
    private int coursecount;
   
    public Student(String name){
        this.name = name;
        this.courses = new Course[5];
        this.coursecount = 0;
    }
    public String getName(){
        return name;
    }
    void addcourse(Course c){
        if(coursecount<5){
            courses[coursecount++] = c;
            c.addstudent(this);
        }else{
            System.out.println("Maximum Courses Reached for Student "+name);
            System.out.println();
        }
    }
    void getcourses(){
        System.out.println(name+"'s Courses :" );
        System.out.println("---------------------------------------------");
        for(int i=0;i<coursecount;i++){
            System.out.println("Code : "+courses[i].getCode()+" || Course : "+courses[i].getCourse());
        }
        System.out.println("---------------------------------------------");
    }
}
class Course{
    private String code;
    private String title;
    private Student[] students;
    private int count;

    public Course(String code,String course){
        this.code = code;
        this.title = course;
        this.students = new Student[5];
        this.count = 0;
    }
    public String getCode(){
        return code;
    }
    public String getCourse(){
        return title;
    }
    void addstudent(Student s){
        if(count<5){
            students[count++] = s;
        }else{
            System.out.println("Maximum Students Reached");
            System.out.println();
        }
    }
    void getstudentdetails(){
        System.out.println("Course : "+title+" (Code : "+code+")");
        System.out.println("Students Enrolled");
        System.out.println("----------------");
        for(int i=0;i<count;i++){
            System.out.println("Student "+i+" : "+students[i].getName());
        }
        System.out.println("----------------");
    }
}
public class StudentCourseEnrollmentSystem {
    public static void main(String[] args) {
        Course c1 = new Course("cs123", "java");
        Course c2 = new Course("cs234","python");
        Course c3 = new Course("cs135","DSA");
        Course c4 = new Course("cs246","SQL");
        Course c5 = new Course("cs987","c++");

        Student s1 = new Student("vishva");
        Student s2 = new Student("ravi");
        Student s3 = new Student("sanjai");

        s1.addcourse(c1);s1.addcourse(c2);s1.addcourse(c3);s1.addcourse(c4);
        s2.addcourse(c1);s2.addcourse(c2);s2.addcourse(c3);
        s3.addcourse(c1);s3.addcourse(c2);s3.addcourse(c3);s3.addcourse(c4);s3.addcourse(c5);

        s1.getcourses();
        s2.getcourses();
        s3.getcourses();

        // c1.addstudent(s1);
        // c2.addstudent(s2);
        // c3.addstudent(s3);

        c1.getstudentdetails();
        c2.getstudentdetails();
        c3.getstudentdetails();
        c4.getstudentdetails();
        c5.getstudentdetails();

    }
}
//bidirectinal method 
// Scenario: Student-Course Relationship
// A Student knows which Courses they are enrolled in.

// A Course knows which Students are enrolled in it.

// 🛡️ Even though they reference each other, data access is always done via methods, not direct field access.

