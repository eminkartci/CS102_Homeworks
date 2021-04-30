public class Blackberry extends Fruit implements GroundFruit{

    public Blackberry(){
        setColor("Black");
    }

    @Override
    public String getVitamin() {
        return "C "+ "K";
    }

    @Override
    public void pick() {
        System.out.println("Picking a blackberry.");
    }
    
}
