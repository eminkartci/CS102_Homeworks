

public class Quadrilateral {

    private Point[] points = new Point[4];


    // Main constructure 
    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){
        this.points[0] = p1;
        this.points[1] = p2;
        this.points[2] = p3;
        this.points[3] = p4;
    }

    // to print console 
    public void print_console(){
        // type 
        System.out.println("\n --- Quadrilateral --- ");

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            System.out.print("Point " + (i + 1)+": ");
            // point coordinate
            this.points[i].print_point();
        }
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

        area = Math.abs(area) / 2;
        System.out.println("The are is " + area);
    }
}
