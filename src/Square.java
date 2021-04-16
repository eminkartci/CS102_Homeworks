

public class Square extends Rectangle{

    private double edge;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        calculateEdge();
    }

    public void calculateEdge(){

        // Find the points has same x axis
            // Then difference of Y coordinates gives us the length of an edge
        if ((getPoints()[0].getX()-getPoints()[1].getX()) == 0){
            this.edge = getPoints()[0].getY() - getPoints()[1].getY();
        }else if(getPoints()[0].getX()-getPoints()[1].getX() == 0){
            this.edge = getPoints()[0].getY() - getPoints()[2].getY();
        }else if(getPoints()[0].getX()-getPoints()[3].getX() == 0){
            this.edge = getPoints()[0].getY() - getPoints()[3].getY();
        }
        this.edge = Math.abs(this.edge);
    }

    public String toString(){
        // type 
        String content = "\n --- Square --- ";

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +getPoints()[i].toString();
            // point coordinate
        }
        return content;
    }
    
}
