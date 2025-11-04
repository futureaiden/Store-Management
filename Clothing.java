// Subclass representing a clothing item
public class Clothing extends StoreRunner {
    // Additional instance variable specific to clothing
    private String size;

    // No-argument constructor
    public Clothing() {
        super();
        this.size = "";
    }

    // Parameterized constructor
    public Clothing(String name, double price, int stock, String size) {
        super(name, price, stock); // Calling superclass constructor
        this.size = size;
    }

    // Accessor methods
    public String getSize() {
        return size;
    }

    // Mutator method
    public void setSize(String size) {
        this.size = size;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}
