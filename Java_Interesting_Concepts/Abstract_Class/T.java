abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    //  Abstract method
    abstract void makeSound();

    //  Concrete method
    void sleep() {
        System.out.println(name + " is sleeping...");
    }

    //  main() method in abstract class
    public static void main(String[] args) {
        
        // You cannot create an object of Animal directly
        // Animal a = new Animal("Generic"); 

        // But you can create a subclass object
        Dog dog = new Dog("Rex");
        dog.makeSound();
        dog.sleep();
    }
}

//  Subclass that inherits and implements the abstract method
class Dog extends Animal {
    Dog(String name) {
        super(name); // Calls constructor of abstract class
        System.out.println("Dog constructor called");
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
