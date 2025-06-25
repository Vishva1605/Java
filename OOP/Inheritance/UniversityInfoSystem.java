class Student{
    void display(){
        System.out.println("I am a Student");
    }
}
class CollegeStudent extends Student{
    void display(){
        super.display();
        System.out.println("I am a CollegeStudent");
    }
}
public class UniversityInfoSystem {
    public static void main(String[] args) {
        CollegeStudent c1 = new CollegeStudent();
        c1.display();
    }
}
//  Scenario: University Info System
// Create 2 classes:

// Student class:

// Method: displayInfo() → prints: "I am a student"

// CollegeStudent class extends Student:

// Override displayInfo() to print:

// super.displayInfo()

// "I am a college student"