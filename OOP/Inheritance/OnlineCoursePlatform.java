class Course{
    private String courseId;
    private String courseName;
    public Course(String courseId,String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public String getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    
}
class OnlineCourse extends Course{
    private String duration;
    private String platform;
    public OnlineCourse(String courseId,String courseName,String duration,String platform){
        super(courseId,courseName);
        this.duration = duration;
        this.platform = platform;
    }
    void display(){
        System.out.println("\tOnline Course Details");
        System.out.println("--------------------------------------");
        System.out.println("Course Id       : "+getCourseId());
        System.out.println("Course Name     : "+getCourseName());
        System.out.println("Course Duration : "+duration);
        System.out.println("Course Platform : "+platform);
        System.out.println("--------------------------------------");
    }
}
public class OnlineCoursePlatform {
    public static void main(String[] args) {
        OnlineCourse o1 = new OnlineCourse("cs123","java","3hrs","Google Meet");
        o1.display();
    }
}
// 8. Online Course Platform
// Parent Class: Course with courseId, name.

// Child Class: OnlineCourse with duration, platform.

// Task: Display full online course details.


