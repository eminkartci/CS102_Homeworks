public abstract class Fruit {

    private String color;

    // Behaviours
    public abstract String getVitamin();

    // GETTER SETTER
    
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    
}
