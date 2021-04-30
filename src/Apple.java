public class Apple extends Fruit implements TreeFruit{

    public Apple(){
        setColor("Green");
    }
    // Override abstract methids
    @Override
    public String getVitamin() {
        return "A " + "B12";
    }
    @Override
    public void peel() {
        System.out.println("Peeling an apple.");
    }
    
}
