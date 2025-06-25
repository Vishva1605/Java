//Check if a string contains only digits.
public class DigitOnlyStringChecker {
    public static void main(string[] args) {
        String str = "1234.5678";
        boolean res = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                res = false;
                break;
            }
        }
        if(!res){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}

// another method

// public class string17{
//     public static void main(String[] args) {
//         String str = "123457890";
//         if(str.matches("\\d+")){                  //if(str.matches("[0-9]+"))
//             System.out.println("yes");
//         }else{
//             System.out.println("no");
//         }
//     }
// }

