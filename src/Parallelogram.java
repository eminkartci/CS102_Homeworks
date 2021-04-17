import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parallelogram extends Trapezoid{

    private static final String DEFAULT_COLOR = "Green";

    // Attributes
    private String ID;

    // Main constructor
    public Parallelogram(Point p1, Point p2, Point p3, Point p4,String ID,String color) {
        super(p1, p2, p3, p4,color);
        this.ID = ID;
    }

    // Default color is green
    public Parallelogram(Point p1, Point p2, Point p3, Point p4,String ID) {
        this(p1, p2, p3, p4, ID,DEFAULT_COLOR);
    }

    // RANDOM ID
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        this(p1, p2, p3, p4,getRandomID() ,DEFAULT_COLOR);
    }

    public static String getRandomID(){
        return Double.toString(Math.random() * 10000);
    }

    public String toString(){
        // type 
        String content = "\n --- Parallelogram --- " 
                        +"\n | ID   : " + this.ID
                        +"\n | Area : " + getArea()
                        +"\n | Color: " + getColor();

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +getPoints()[i].toString();
            // point coordinate
        }
        return content;
    }

    public void saveAsTxt(){

        try {
            // Create a filewriter
                // file parameter
            FileWriter myWriter = new FileWriter(new File(this.ID.replace(".", "")+".txt"));

            // write it
            myWriter.write(toString());
            // close properly
            myWriter.close();

            // inform the user
            System.out.println("Succeassfully Saved !!");

        // Except
        } catch (IOException e) {
            // warn the user
            System.out.println("There is a problem while saving as txt !!");

        }

    }

    public String getID(){
        return this.ID;
    }
    
}
