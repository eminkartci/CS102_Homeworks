

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
        System.out.println(" --- Quadrilateral --- ");

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            System.out.println( "Point " + (i + 1)+": ");
            // point coordinate
            this.points[i].print_point();
        }
    }
    
}
