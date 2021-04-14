

public class Square extends Rectangle{

    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // to print console 
    public void print_console(){
        // type 
        System.out.println(" --- Square --- ");

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            System.out.print( "Point " + (i + 1)+": ");
            // point coordinate
            getPoints()[i].print_point();
        }
    }
    
}
