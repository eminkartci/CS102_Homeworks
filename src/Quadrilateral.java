

public class Quadrilateral {

    // Attributes
    private Point[] points = new Point[4];
    private double area;


    // Main constructure 
    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){
        this.points[0] = p1;
        this.points[1] = p2;
        this.points[2] = p3;
        this.points[3] = p4;
        calculateArea();
    }

    // to print console 
    public void print_console(){
        System.out.println(toString());
    }

    public String toString(){
        // type 
        String content = "\n --- Quadrilateral --- " 
                        +"\n | Area: " + this.area;

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +this.points[i].toString();
            // point coordinate
        }
        return content;
    }

    // GETTER - SETTER

    public Point[] getPoints() {
        return this.points;
    }
    
    public void calculateArea(){

        double area = 0,positive = 0,negative = 0;

        for(int i = 0 ; i < this.points.length; i++){

            if(i == this.points.length-1){
                positive = this.points[i].getX() * this.points[0].getY();
                negative = this.points[0].getX() * this.points[i].getY();
            }else{
                positive = this.points[i].getX() * this.points[i+1].getY();
                negative = this.points[i+1].getX() * this.points[i].getY();
            }

            area += positive - negative;
            
            // Debugging Code
            //System.out.println("Positive: " + positive+ "\nNegative: " + negative + "\nArea: "+ area);
        }

        this.area = Math.abs(area) / 2;
    }

    public double getArea(){
        return this.area;
    }
}
