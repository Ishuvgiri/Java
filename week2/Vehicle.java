public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
        public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}



class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}
