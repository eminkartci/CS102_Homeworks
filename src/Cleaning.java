
public class Cleaning extends Product {
    private String brand;

    public Cleaning(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return super.toString() + "\nBrand = " + this.brand;
    }
}
