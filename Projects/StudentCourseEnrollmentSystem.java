import java.util.Scanner;

class Student {
    private String name;
    private Course[] courses;
    private int coursecount;

    public Student(String name) {
        this.name = name;
        this.courses = new Course[5];
        this.coursecount = 0;
    }

    public String getName() {
        return name;
    }

    void addcourse(Course c) {
        if (coursecount < 5) {
            courses[coursecount++] = c;
            c.addstudent(this);
        } else {
            System.out.println("Maximum Courses Reached for Student " + name);
            System.out.println();
        }
    }

    void getcourses() {
        System.out.println(name + "'s Courses :");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < coursecount; i++) {
            System.out.println("Code : " + courses[i].getCode() + " || Course : " + courses[i].getCourse());
        }
        System.out.println("---------------------------------------------");
    }
}

class Course {
    private String code;
    private String title;
    private Student[] students;
    private int count;

    public Course(String code, String course) {
        this.code = code;
        this.title = course;
        this.students = new Student[5];
        this.count = 0;
    }

    public String getCode() {
        return code;
    }

    public String getCourse() {
        return title;
    }

    void addstudent(Student s) {
        if (count < 5) {
            students[count++] = s;
        } else {
            System.out.println("Maximum Students Reached");
            System.out.println();
        }
    }

    void getstudentdetails() {
        System.out.println("Course : " + title + " (Code : " + code + ")");
        System.out.println("Students Enrolled");
        System.out.println("----------------");
        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1) + " : " + students[i].getName());
        }
        System.out.println("----------------");
    }
}

public class StudentCourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create courses
        Course[] courses = new Course[5];
        System.out.println("Enter 5 course details:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter course code for course " + (i + 1) + ": ");
            String code = sc.nextLine();
            System.out.print("Enter course title for course " + (i + 1) + ": ");
            String title = sc.nextLine();
            courses[i] = new Course(code, title);
        }

        // Create students
        Student[] students = new Student[3];
        System.out.println("\nEnter names of 3 students:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students[i] = new Student(name);
        }

        // Enroll students in courses
        System.out.println("\n--- Course Enrollment ---");
        for (Student student : students) {
            System.out.println("\nEnroll courses for " + student.getName());
            for (int i = 0; i < 5; i++) {
                System.out.print("Do you want to enroll in " + courses[i].getCourse() + "? (yes/no): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    student.addcourse(courses[i]);
                }
            }
        }

        // Show student course details
        System.out.println("\n--- Student Course Details ---");
        for (Student student : students) {
            student.getcourses();
        }

        // Show course student details
        System.out.println("\n--- Course Student Details ---");
        for (Course course : courses) {
            course.getstudentdetails();
        }

        sc.close();
    }
}
