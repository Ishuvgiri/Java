public class Person{
    public void displayInfo(){
        System.out.println("This is a person.");
        
    }

        public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDepartment();
        emp.displayDepartment();
        emp.displayInfo();
    }
}



class Employee extends Person {

    public void displayDepartment() {
        System.out.println("This is an employee.");
    }
}
  
  class Manager extends Employee {
        public void displayRole() {
            System.out.println("This is a manager.");
        }
    }
    
