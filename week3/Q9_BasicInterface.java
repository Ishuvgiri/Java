// [9] Basic Interface Implementation: Create an interface Runnable with a method run(). 
// Create a class Car that implements Runnable and overrides the run() method to print "Car is running." 
// Instantiate a Car object and call the run() method.

interface Runnable9 {
    void run();
}

class Car9 implements Runnable9 {
    @Override
    public void run() {
        System.out.println("Car is running.");
    }
}

public class Q9_BasicInterface {
    public static void main(String[] args) {
        Car9 car = new Car9();
        car.run();
    }
}
