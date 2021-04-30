public class Strawberry extends Fruit implements GroundFruit{

    public Strawberry(){
        setColor("Red");
    }

    @Override
    public String getVitamin() {
        return "B5 " + "E";
    }

    @Override
    public void pick() {
        System.out.println("Picking a strawberry.");
    }
    
}
