abstract class Animal{
    abstract void sound();
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Moo");
    }
}
public class AnimalSoundAbstractDemo {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();
        for(Animal a : animals){
            a.sound();
        }
        // Animal a1 = new Cat();
        // Animal a2 = new Dog();
        // Animal a3 = new Cow();
        // a1.sound();a2.sound();a3.sound();
    }
}
