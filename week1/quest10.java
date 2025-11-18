import java.util.Scanner;

public class quest10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the quantity of items: ");
            double quantity = scanner.nextDouble();
            
            System.out.print("Enter the price per item: ");
            double price = scanner.nextDouble();
            
            double totalCost = quantity * price;
            
            System.out.println("Total cost: " + totalCost);
        }
    }
}
