class Grandparent {
    void show() {
        System.out.println("I am the Grandparent");
    }
}
class Parent extends Grandparent {
    void show() {
        System.out.println("I am the Parent");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("I am the Child");
    }
    void displayAll() {
        super.show(); // Calls Parent's show()
        ((Grandparent)this).show(); // Calls Grandparent's show()
        this.show(); // Calls Child's show()
    }
}
public class inheritence {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayAll();
    }
}