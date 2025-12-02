// [6] Access Parent Class Methods: Create a class Vehicle with a method start(). 
// Create a class Car that extends Vehicle and overrides the start() method. 
// In the Car class, use super.start() to call the parent class's start() method. 
// Instantiate a Car object and call the start() method.

class Vehicle6 {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car6 extends Vehicle6 {
    @Override
    void start() {
        super.start();
        System.out.println("Car started.");
    }
}

public class Q6_SuperMethod {
    public static void main(String[] args) {
        Car6 car = new Car6();
        car.start();
    }
}
