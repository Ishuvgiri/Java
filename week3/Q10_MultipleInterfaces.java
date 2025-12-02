// [10] Multiple Interfaces Implementation: Create two interfaces: Swimable (with a method swim()) and Flyable (with a method fly()). 
// Create a class Duck that implements both interfaces. 
// Instantiate a Duck object and call both swim() and fly() methods.

interface Swimable {
    void swim();
}

interface Flyable10 {
    void fly();
}

class Duck implements Swimable, Flyable10 {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
    
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

public class Q10_MultipleInterfaces {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}
