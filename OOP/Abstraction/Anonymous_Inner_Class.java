abstract class Animal{
    abstract void makesound();
}
public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        Animal a1 = new Animal() {
            void makesound(){
                System.out.println("Dog Says : Bark");
            }
        };
        a1.makesound();
    }
}
