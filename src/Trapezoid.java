import java.util.Random;

public class Trapezoid extends Quadrilateral{

    private String color;

    public Trapezoid(Point p1, Point p2, Point p3, Point p4,String color) {
        super(p1, p2, p3, p4);
        this.color = color;
    }

    public Trapezoid(Point p1, Point p2, Point p3, Point p4){
        this(p1, p2, p3, p4,"white");
    }

    public String toString(){
        // type 
        String content = "\n --- Trapezoid --- ";

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +getPoints()[i].toString();
            // point coordinate
        }
        return content;
    }

    public void setRandomColor(){
        String[] colors = {"Black","Red","White","Green","Orange","Purple"};
        Random random = new Random();
        this.color = colors[random.nextInt(colors.length)];
    }

    // GETTER SETTER
    public String getColor(){
        return this.color;
    }
    
}
