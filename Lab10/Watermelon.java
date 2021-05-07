public class Watermelon extends Fruit implements GroundFruit{




    @Override
    public String getVitamin() {
        return "E";
    }

    @Override
    public void pick() {
        System.out.println("Watermelon is picking.");
    }
    
}
