
public class Food extends Product {
   
    private double weight;
    private String expirationDate;

    public Food(double taxRate, double weight) {
        setTaxRate(taxRate);
        this.weight = weight;
        this.expirationDate = "13.11.2021";
    }

    public Food(String name) {
        this.expirationDate = "13.11.2021";
        setName(name);
        setTaxRate(18.);
        setPrice(1.);
    }

    public String toString() {
        return super.toString() + "\nWeight = " + this.weight + "\nExpiration Date = " + this.expirationDate;
    }
}
