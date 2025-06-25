//Check if a string is a rotation of another.
public class RotationChecker {
    public static void main(string[] args) {
        String a = "Abcd1".toLowerCase();
        String b = "cd1ab".toLowerCase();
        if(a.length()!=b.length()){
            System.out.println("not a Rotation");
        }else{
            a = a + a;
            if(a.contains(b)){
                System.out.println("it's a Rotation");
            }else{
                System.out.println("not a Rotation");
            }
        }
    }
}
