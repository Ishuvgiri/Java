// [5] Access Parent Class Constructor: Create a class Animal with a constructor that prints "Animal created". 
// Create a subclass Dog that calls the Animal constructor using the super() keyword and adds a constructor to print "Dog created". 
// Instantiate an object of Dog and observe the output.

class Animal5 {
    Animal5() {
        System.out.println("Animal created");
    }
}

class Dog5 extends Animal5 {
    Dog5() {
        super();
        System.out.println("Dog created");
    }
}

public class Q5_SuperConstructor {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
    }
}
