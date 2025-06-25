import java.util.Scanner;
class University{
    final String name = "XYZ University";
    class Department{
        void showUniversityName(){
            System.out.println("University Name : "+name);
        }
        void listDepartments(){
            System.out.println("List Of Depatments");
            System.out.println("---------------------------");
            System.out.println("1. CSE");
            System.out.println("2. IT");
            System.out.println("3. MECH");  
            System.out.println("---------------------------");
        }
        void showcoursesInDepartment(int select){
            switch(select){
                case 1 -> System.out.println("Courses : Java, python, Dsa");
                case 2 -> System.out.println("Courses : DBMS, SQl, C++");
                case 3 -> System.out.println("Courses : ML, Ai, Aids");
                default -> System.out.println("Enter Valid Department id");
            }
        }
        void exit(){
            System.out.println("Thank you for Visiting....");
        }
    }
}
public class UniversityDepartmentPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University u1 = new University();
        University.Department d1 = u1.new Department();
        System.out.println("\tUniversity Menu");
        System.out.println("---------------------------------");
        System.out.println("1. Show University Name");
        System.out.println("2. List Departments");
        System.out.println("3. Show Courses in Department");
        System.out.println("4. Exit");
        System.out.println("---------------------------------");
        String answer;
        do{
            System.out.print("Do you want to See Menu (yes/no): ");
            answer = sc.nextLine();
            if(answer.matches("yes")){
                System.out.print("Enter your Choice : ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1 :
                        d1.showUniversityName();
                        break;
                    case 2 :
                        d1.listDepartments();
                        break;
                    case 3 :
                        System.out.println("\tList Of Depatments");
                        System.out.println("---------------------------");
                        System.out.println("1. CSE");
                        System.out.println("2. IT");
                        System.out.println("3. MECH");  
                        System.out.println("---------------------------");
                        System.out.print("Enter Your Choice : ");
                        int select = sc.nextInt();
                        sc.nextLine();
                        d1.showcoursesInDepartment(select);
                        break;
                    case 4:
                        d1.exit();
                        break;
                    default :
                        System.out.println("Invalid Choice");
                }
            }else if(!answer.equalsIgnoreCase("no")){
                System.out.println("Invalid Input Enter 'yes' or 'no'");
            }
            else{
                System.out.println("Thank you !");
            }
        }while (!answer.equalsIgnoreCase("no")); 
        sc.close();
    }
}
