

public class Quadrilateral {

    // Attributes
    private Point[] points = new Point[4];
    private double area;


    // Main constructure 
    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){
        // assign the points
        this.points[0] = p1;
        this.points[1] = p2;
        this.points[2] = p3;
        this.points[3] = p4;

        // immidiately calculate the area
        calculateArea();
        System.out.println("Area is "+ this.area);
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
        // initialize variables
        double area = 0,positive = 0,negative = 0;

        // DETERMINANT TECHNIQUE
            // | p1x p1y | -> p2x * p1y - p1x * p2y 
            // | p2x p2y | -> p3x * p4y - p2x * p1y 
            // | p3x p3y | ...
            // | p4x p4y | ...
            // | p1x p1y | ...
                // Sum all results
                // Get absolute value
                // Divide by 2
        for(int i = 0 ; i < this.points.length; i++){
            
            // last one repeates first point
            if(i == this.points.length-1){
                positive = this.points[i].getX() * this.points[0].getY();
                negative = this.points[0].getX() * this.points[i].getY();
            }// otherwise go ahead
            else{
                positive = this.points[i].getX() * this.points[i+1].getY();
                negative = this.points[i+1].getX() * this.points[i].getY();
            }
            // by the formula
            area += positive - negative;
            
            // Debugging Code
            //System.out.println("Positive: " + positive+ "\nNegative: " + negative + "\nArea: "+ area);
        }

        // if the area is calculated as 0 shift the ponints and recalculate
        if(area == 0){
            // get first point
            Point p1 = this.points[0];
            // overwrite second point to first one
            this.points[0] = this.points[1];
            // put first point to second place 
            this.points[1] = p1;
            // calculate again 
            recalculateArea(); // WARNING - using recursion here may cause infinite loop !!
                               // Hence define a new function 
        }

        // by the formula
            // absolute value
            // half of it
        this.area = Math.abs(area) / 2;
    }

    // to avoid infinite loop
    public void recalculateArea(){
        
        // SAME TECHNIQUE
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

        if(area == 0){
            System.out.println("Please control the Points !!");
        }
        this.area = Math.abs(area) / 2;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double area){
        this.area=area;
    }
}
