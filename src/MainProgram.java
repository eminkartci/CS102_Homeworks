public class MainProgram {

    public static void main(String[] args){

        // Generate Objects

            // Trapezoid
            Trapezoid trapezoid = new Trapezoid(new Point(4,10),new Point(9,7),new Point(11,2),new Point(2,2));
            trapezoid.print_console();
            trapezoid.calculateArea();

            //Parallelogram
            Parallelogram parallelogram = new Parallelogram(new Point(0,0),new Point(5,0),new Point(2,3),new Point(7,3));
            parallelogram.print_console();
            parallelogram.calculateArea();
            parallelogram.saveAsTxt();
            // Rectangle
            Rectangle rectangle = new Rectangle(new Point(1,1),new Point(6,1),new Point(6,6),new Point(1,6));
            rectangle.print_console();
            rectangle.calculateArea();
            rectangle.plotOnConsole();
            // Square
            // Square square = new Square(new Point(0,0),new Point(6,0),new Point(6,6),new Point(0,6));
            // square.print_console();
            // square.calculateArea();
            // square.saveAsTxt();

            Square square = new Square(new Point(0,0),new Point(6,0),new Point(0,6),new Point(6,6));
            square.calculateArea();
            square.print_console();
    }
    
}
