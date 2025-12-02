// [3] Hierarchical Inheritance: Create a class Animal with a method sound(). 
// Create two classes Dog and Cat that extend Animal and override the sound() method to print "Bark" and "Meow," respectively. 
// Instantiate objects of both classes and call their sound() methods.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Q3_HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.sound();
        cat.sound();
    }
}
