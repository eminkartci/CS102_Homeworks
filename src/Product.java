public class Product {

    // Attributes
    private double taxRate;
    private double price;
    private String name;

    public Product(double taxRate, double price) {
        this.taxRate = taxRate;
        this.price = price;
    }

    public Product(double taxRate) {
        this(taxRate, 1.);
    }
    
    public Product() {
        this(18., 1.);
    }
    
}
