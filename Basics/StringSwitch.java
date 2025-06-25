public class StringSwitch {
    public static void main(string[] args) {
        String day = "Tuesday";
        switch (day) {
            case "Monday" -> System.out.println("wake up 8 am");
            case "Saturday","Sunday","Tuesday" -> System.out.println("wake up 6 am");
            default -> System.out.println("wake up 7 am");
        }
    }
}
//switch (day) {
      //      case "Monday": yield System.out.println("wake up 8 am");
    //        case "Saturday","Sunday","Tuesday": yield System.out.println("wake up 6 am");
  //          default: yield System.out.println("wake up 7 am");
//}