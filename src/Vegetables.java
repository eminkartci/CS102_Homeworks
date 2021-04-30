public class Vegetables extends Food{

    private boolean organic;

    public Vegetables(double taxRate, double weight,boolean organic, String name){
        super(taxRate, weight);
        this.organic = organic;
        setName(name);
    }
    
}
