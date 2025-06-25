package Encapsulation;
class Student {
    // private int id;
    private String name;
    private Course[] enrollcourses;
    private int coursecount;

    public Student(int StudentId, String StudentName) {
        // this.id = StudentId;
        this.name = StudentName;
        this.coursecount = 0;
        this.enrollcourses = new Course[5]; // Course[] instead of String[]
    }

    public boolean enroll(Course c) {
        // Prevent duplicate enrollment
        for (int i = 0; i < coursecount; i++) {
            if (enrollcourses[i].getCode().equals(c.getCode())) {
                System.out.println("Already enrolled in " + c.getTitle());
                return false;
            }
        }

        if (coursecount < 5) {
            enrollcourses[coursecount++] = c;
            return true;
        } else {
            System.out.println("Reached Maximum Of Courses");
            return false;
        }
    }

    public void showcourses() {
        System.out.println("\nStudent: " + name + " | Enrolled Courses:");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < coursecount; i++) {
            System.out.println("Code: " + enrollcourses[i].getCode() +
                               " || Course: " + enrollcourses[i].getTitle());
        }
        System.out.println("--------------------------------------------");
    }
}

class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}

public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vishva");

        Course c1 = new Course("cs123", "Java");
        Course c2 = new Course("cs321", "Python");
        Course c3 = new Course("cs135", "DSA");
        Course c4 = new Course("cs246", "SQL");
        Course c5 = new Course("cs777", "AI");
        Course c6 = new Course("cs888", "ML");

        s1.enroll(c1);
        s1.enroll(c2);
        s1.enroll(c3);
        s1.enroll(c4);
        s1.enroll(c5);
        s1.enroll(c6); // Should fail, limit is 5

        s1.enroll(c1); // Should show duplicate message

        s1.showcourses();
    }
}
