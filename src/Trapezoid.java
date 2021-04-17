import java.util.Random;

public class Trapezoid extends Quadrilateral{

    // Attributes
    private String color;

    // MAIN Constructor
    public Trapezoid(Point p1, Point p2, Point p3, Point p4,String color) {
        super(p1, p2, p3, p4);
        this.color = color;
    }

    // Default color is white
    public Trapezoid(Point p1, Point p2, Point p3, Point p4){
        // call default constructor
        this(p1, p2, p3, p4,"white");
    }

    public String toString(){
        // type 
        String content = "\n --- Trapezoid --- " 
                        +"\n | Area : " + getArea()
                        +"\n | Color: " + this.color;

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +getPoints()[i].toString();
            // point coordinate
        }
        return content;
    }

    // set random color
    public void setRandomColor(){
        // initialize a color array
        String[] colors = {"Black","Red","White","Green","Orange","Purple"};
        // create random object
        Random random = new Random();
        // assign randomly
        this.color = colors[random.nextInt(colors.length)];
    }

    // GETTER SETTER
    public String getColor(){
        return this.color;
    }
    
}
