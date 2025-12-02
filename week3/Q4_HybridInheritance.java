// [4] Hybrid Inheritance: Create an interface Flyable with a method fly(). 
// Then create a class Bird that implements Flyable and another class Animal with a method eat(). 
// Create a class Eagle that extends Animal and implements Flyable. 
// Instantiate an object of Eagle and call both eat() and fly() methods.

interface Flyable {
    void fly();
}

class Animal4 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Eagle extends Animal4 implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }
}

public class Q4_HybridInheritance {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
    }
}
