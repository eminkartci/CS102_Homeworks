public class Detergent extends Cleaning{
    
    private double lts;
    private boolean liquid;

    public Detergent(String brand){
        super(brand);
    }

    public Detergent(double lts,boolean liquid, String brand){
        super(brand);
        this.lts = lts;
        this.liquid = liquid;
    }

    public String toString() {
        return super.toString() + "\nLts = " + this.lts + "\nLiquid = " + this.liquid;
    }
}
