public class Switch1 {
    public static void main(string[] args) {
        int x = 50;
        int y = 10;
        char ch = '-';
        switch(ch){
            case '+' -> System.out.println(x+y);
            case '-' -> System.out.println(x-y);
            case '*' -> System.out.println(x*y);
            case '/' -> System.out.println(x/y);
            //case 5 -> System.out.println("Friday");
            //case 6 -> System.out.println("Saturday");
            //case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid number");
        }
    }
}
