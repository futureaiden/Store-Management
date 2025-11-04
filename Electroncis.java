// Subclass representing an electronic product
public class Electronics extends StoreRunner {
    // Additional instance variable specific to electronics
    private int warrantyPeriod; // warranty period in months

    // No-argument constructor
    public Electronics() {
        super();
        this.warrantyPeriod = 0;
    }

    // Parameterized constructor
    public Electronics(String name, double price, int stock, int warrantyPeriod) {
        super(name, price, stock); // Calling superclass constructor
        this.warrantyPeriod = warrantyPeriod;
    }

    // Accessor methods
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Mutator method
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Warranty Period: " + warrantyPeriod + " months";
    }
}
