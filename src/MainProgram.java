public class MainProgram {

    public static void main(String[] args){

        // Generate Objects

            // Trapezoid
            Trapezoid trapezoid = new Trapezoid(new Point(0,0),new Point(0,1),new Point(1,0),new Point(1,1));
            trapezoid.print_console();

            //Parallelogram
            Parallelogram parallelogram = new Parallelogram(new Point(0,0),new Point(5,0),new Point(2,3),new Point(2,3));
            parallelogram.print_console();

            // Rectangle
            Rectangle rectangle = new Rectangle(new Point(0,0),new Point(5,0),new Point(0,3),new Point(5,3));
            rectangle.print_console();

            // Square
            Square square = new Square(new Point(0,0),new Point(6,0),new Point(0,6),new Point(6,6));
            square.print_console();

    }
    
}
