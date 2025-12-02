// [7] Abstract Class with Abstract Method: Create an abstract class Shape with an abstract method area(). 
// Create two subclasses Circle and Rectangle that implement the area() method. 
// Instantiate objects of both subclasses and print their areas.

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle7 extends Shape {
    private double length;
    private double breadth;
    
    Rectangle7(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    double area() {
        return length * breadth;
    }
}

public class Q7_AbstractClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle7 rectangle = new Rectangle7(4.0, 6.0);
        
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
