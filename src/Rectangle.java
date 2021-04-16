public class Rectangle extends Parallelogram{

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public String toString(){
        // type 
        String content = "\n --- Rectangle --- ";

        // Points
        for( int i = 0 ; i < 4 ; i++){
            // order of the points starting from 1 to 4
            content += "\nPoint " + (i + 1)+": " +getPoints()[i].toString();
            // point coordinate
        }
        return content;
    }

    public void plotOnConsole(){

        for(int i = 0 ; i < getHeight() ; i++){

            for (int j = 0 ; j < getWidth() ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private int getWidth(){

        int width = (int) Math.abs((getPoints()[0].getX() - getPoints()[1].getX()));

        if (width == 0 ){
            width = (int) Math.abs((getPoints()[0].getX() - getPoints()[2].getX()));
        }

        return width;
    }

    private int getHeight(){

        int height = (int) Math.abs((getPoints()[0].getY() - getPoints()[1].getY()));

        if (height == 0 ){
            height = (int) Math.abs((getPoints()[0].getY() - getPoints()[2].getY()));
        }

        return height;
    }
    
}
