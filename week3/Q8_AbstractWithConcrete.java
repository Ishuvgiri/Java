// [8] Abstract Class with Concrete Methods: Create an abstract class Appliance with a concrete method turnOn() and an abstract method operate(). 
// Create a subclass WashingMachine that implements the abstract method operate(). 
// Instantiate the WashingMachine and call both turnOn() and operate() methods.

abstract class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned on.");
    }
    
    abstract void operate();
}

class WashingMachine extends Appliance {
    @Override
    void operate() {
        System.out.println("Washing machine is washing clothes.");
    }
}

public class Q8_AbstractWithConcrete {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.turnOn();
        wm.operate();
    }
}
