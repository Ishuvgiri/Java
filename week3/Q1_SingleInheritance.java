// [1] Single Inheritance: Create two classes: Vehicle (with a method start()) and Car (which inherits from Vehicle). 
// In the Car class, override the start() method to print "Car started." 
// Create an object of the Car class and call the start() method.

class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

public class Q1_SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
