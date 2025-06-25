
@FunctionalInterface
interface A{
    void show(int i);
}
public class LamdaPractice {
    public static void main(String[] args) {
    // A obj = () -> {
    //         System.out.println("In a show");
    //      };
    //     obj.show();//op: In a show
    // A obj = (int i) -> {
    //         System.out.println("In a show "+i);
    //      };
    //     obj.show(4);//op:In a show 4
    // }
    // A obj = (i,j) -> { // we already diclare the datatype in interface so we dont have to mention it.
    //         System.out.println("In a show "+i+j);
    //      };
    //     obj.show(5,7);//op: In a show 57
    A obj = i -> { // if we have only one variable then we dont need paranthesis either 
            System.out.println("In a show "+i);
         };
        obj.show(6);
    }
}
