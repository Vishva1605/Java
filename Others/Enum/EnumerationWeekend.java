package Others.Enum;
    import java.util.Scanner;
    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
    public class EnumerationWeekend{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Day (in Capital) : ");
            String day = sc.nextLine();
            try{
                Day d = Day.valueOf(day);
                if(d == Day.SATURDAY||d == Day.SUNDAY){
                    System.out.println("Weekend");
                }else{
                    System.out.println("Weekday");
                }
            }catch(IllegalArgumentException e){
                System.out.println("Invalid input");
            }
            sc.close();
        }
    }
