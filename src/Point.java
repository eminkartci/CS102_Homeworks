

public class Point {

    private double x;
    private double y;

    public Point (double x,double y){
        this.x = x;
        this.y = y;
    }

    public void print_point(){
        String pointInfo = "x coordinate: "+ this.x + " & y coordinate: " + this.y;
        System.out.println(pointInfo);
    }
    
}
