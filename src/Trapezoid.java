public class Trapezoid extends Quadrilateral{

    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // to print console overwrite the function
    public void print_console(){
        // type 
        System.out.println(" --- Trapezoid --- ");

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            System.out.println( "Point " + (i + 1)+": ");
            // point coordinate
            getPoints()[i].print_point();
        }
    }
    
}
