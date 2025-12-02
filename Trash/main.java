 class person {
    String name;
    int age;
 }
  class employee extends person {
    String company;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
    }
    public class main {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "John Doe";
        emp.age = 30;
        emp.company = "Tech Solutions";
        emp.salary = 75000.00;

        emp.displayInfo();
    }
}