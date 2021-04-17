public class Rectangle extends Parallelogram{

    // Attributes
    private int height;
    private int width;
    private static final String DEFAULT_COLOR = "Red";

    // Main Constructor
    public Rectangle(Point p1, Point p2, Point p3, Point p4,String ID,String color) {
        super(p1, p2, p3, p4,ID,color);
        this.width = calculateWidth();
        this.height = calculateHeight();
    }

    // Default color is RED
    public Rectangle(Point p1, Point p2, Point p3, Point p4,String ID) {
        this(p1, p2, p3, p4, ID, DEFAULT_COLOR);
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this(p1, p2, p3, p4,getRandomID(), DEFAULT_COLOR);
    }


    public String toString(){
        // type 
        String content = "\n --- Rectangle --- " 
                        +"\n | ID       : " + getID()
                        +"\n | Width    : " + this.width
                        +"\n | Height   : " + this.height
                        +"\n | Area     : " + getArea()
                        +"\n | Color    : " + getColor();

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +getPoints()[i].toString();
            // point coordinate
        }
        return content;
    }

    public void plotOnConsole(){

        for(int i = 0 ; i < this.height ; i++){

            for (int j = 0 ; j < this.width ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private int calculateWidth(){

        int width = (int) Math.abs((getPoints()[0].getX() - getPoints()[1].getX()));

        if (width == 0 ){
            width = (int) Math.abs((getPoints()[0].getX() - getPoints()[2].getX()));
        }

        return width;
    }

    private int calculateHeight(){

        int height = (int) Math.abs((getPoints()[0].getY() - getPoints()[1].getY()));

        if (height == 0 ){
            height = (int) Math.abs((getPoints()[0].getY() - getPoints()[2].getY()));
        }

        return height;
    }
    
    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}
