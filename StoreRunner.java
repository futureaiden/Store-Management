// Superclass representing a general product
public class StoreRunner {
    // Instance variables shared by all products
    private String name;
    private double price;
    private int stock;

    // No-argument constructor
    public StoreRunner() {
        this.name = "";
        this.price = 0.0;
        this.stock = 0;
    }

    // Parameterized constructor
    public StoreRunner(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // toString method to represent the object in string format
    public String toString() {
        return "Product Name: " + name + ", Price: $" + price + ", Stock: " + stock;
    }
}
