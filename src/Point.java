

public class Point {

    // Attributes
    private double x;
    private double y;

    // Constructor
    public Point (double x,double y){
        this.x = x;
        this.y = y;
    }

    // Print point's information
    public void print_point(){
        System.out.println(this.toString());
    }

    // Overwrite toString
    public String toString(){
        return "("+ this.x + "," + this.y + ")";
    }

    // GETTER - SETTER

    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
}
