package Others.Enum;
interface Sound{
    String makeSound();
}
enum Animal implements Sound{
    DOG("Bark"),CAT("Meow"),COW("Maa");
    private String sound;
    Animal(String sound){
        this.sound = sound;
    }
    public String makeSound(){
        return this.sound;
    }
}
public class EnumerationInterface {
    public static void main(String[] args) {
        for(Animal a : Animal.values()){
            System.out.println(a+" make sound "+a.makeSound());
        }
    }
}
