// [2] Multilevel Inheritance: Create a class Person with a method displayInfo(). 
// Create a class Employee that extends Person and adds a method displayRole(). 
// Then, create a class Manager that extends Employee and adds a method displayDepartment(). 
// Instantiate an object of the Manager class and call all three methods.

class Person {
    void displayInfo() {
        System.out.println("This is a Person.");
    }
}

class Employee extends Person {
    void displayRole() {
        System.out.println("Role: Employee");
    }
}

class Manager extends Employee {
    void displayDepartment() {
        System.out.println("Department: Management");
    }
}

public class Q2_MultilevelInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.displayInfo();
        manager.displayRole();
        manager.displayDepartment();
    }
}
