import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter side a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();
            
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            System.out.println("The area of the triangle is: " + area);
        }
    }
}
