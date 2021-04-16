import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Parallelogram extends Trapezoid{

    private String ID;

    public Parallelogram(Point p1, Point p2, Point p3, Point p4,String ID,String color) {
        super(p1, p2, p3, p4,color);
        this.ID = ID;
    }

    public Parallelogram(Point p1, Point p2, Point p3, Point p4,String color) {
        this(p1, p2, p3, p4, Double.toString(Math.random() * 10000),color);
    }

    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        this(p1, p2, p3, p4, Double.toString(Math.random() * 10000),"White");
    }

    public String toString(){
        // type 
        String content = "\n --- Parallelogram --- ";

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
            FileWriter myWriter = new FileWriter(new File(this.ID.replace(".", "")+"txt"));

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
    
}
