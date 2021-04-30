public class Apple extends Fruit{

    public Apple(){
        setColor("Green");
    }
    // Override abstract methids
    @Override
    public String getVitamin() {
        return "A " + "B12";
    }
    
}
