class Animal{
    void makeSound(){
        System.out.println("Animal Makes Sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks...");
    }
}
public class AnimalSoundPolymorphism {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound(); 
        Animal a1 = new Dog();//Because method overriding depends on the object type, not the reference type.
        a1.makeSound();
    }
}
// 4. Animal-Dog Behavior
// Parent Class: Animal with method makeSound().

// Child Class: Dog which overrides makeSound() to say "Bark".

// Task: Show method overriding using inheritance.


// In main, you're creating an object of class Dog.

// When d1.makeSound() is called, the child class version runs — this is runtime polymorphism.