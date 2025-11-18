import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double s= (num1 + num2 + num3) / 2;
        double area = Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}
