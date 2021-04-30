public class Dairy extends Food {
    private boolean pasteurized;

    public Dairy(double taxRate, double weight, boolean pasteurized, String name) {
        super(taxRate, weight);
        this.pasteurized = pasteurized;
        this.setName(name);
    }

    public String toString() {
        return super.toString() + "\nPasteurized = " + this.pasteurized;
    }
}
