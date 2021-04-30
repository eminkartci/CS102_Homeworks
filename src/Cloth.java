
public class Cloth extends Product {
    private String brand;
    private String color;
    private int quantity;

    public Cloth(double taxRate, String color, String brand) {
        super(taxRate);
        this.color = color;
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
