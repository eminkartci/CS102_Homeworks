public class Banana extends Fruit implements TreeFruit{

    public Banana(){
        setColor("Yellow");
    }

    @Override
    public String getVitamin() {
        return "C " + "D";
    }

    @Override
    public void peel() {
        
    }


    
}
