import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        // Create instances of products using constructors
        StoreRunner genericProduct = new StoreRunner("Generic Item", 19.99, 100);
        Electronics laptop = new Electronics("Laptop", 799.99, 50, 24);
        Clothing tShirt = new Clothing("T-Shirt", 15.99, 200, "L");

        // Display information using toString methods
        System.out.println(genericProduct);
        System.out.println(laptop);
        System.out.println(tShirt);

        // Using Scanner to get user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a product name:");
        String productName = scanner.nextLine();

        System.out.println("Enter price:");
        double price = scanner.nextDouble();

        System.out.println("Enter stock quantity:");
        int stock = scanner.nextInt();

      //Adds up quanity, price, and name.
        StoreRunner userStoreRunner = new StoreRunner(productName, price, stock);
        System.out.println("Created product: " + userStoreRunner);
    }
}
