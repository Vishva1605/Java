public class AdvSwitch {
    public static void main(string[] args) {
        int n = 4;
        switch(n){
            case 1 -> System.out.println("Monday"); 
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid number");
        }
    }
}
