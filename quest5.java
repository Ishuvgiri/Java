import java.util.Scanner;

public class quest5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of the square: ");
            double length = scanner.nextDouble();
            double area = length * length;
            System.out.println("The area of square is: " + area);
        }
    }

}