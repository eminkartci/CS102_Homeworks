
public class Skirt extends Cloth {

    public Skirt(int quantity, String brand, String color, double taxRate, String name) {
        super(taxRate, color, brand);
        this.setQuantity(quantity);
        this.setName(name);
    }

    public String toString() {
        return super.toString() + super.getName();
    }
    
}
