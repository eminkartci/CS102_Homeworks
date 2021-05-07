public class Meat extends Food{

    private int quality;

    public Meat(double taxRate, double weight,int quality){
        super(taxRate, weight);
        this.quality = quality;
    }

    public String toString() {
        return super.toString() + "\nQuality = " + this.quality;
    }
    
}
