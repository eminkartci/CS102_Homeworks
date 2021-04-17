public class MainProgram {

    public static void main(String[] args){

        // Generate Objects

            // Trapezoid
            Trapezoid trapezoid = new Trapezoid(new Point(4,10),new Point(9,7),new Point(11,2),new Point(2,2));
            trapezoid.print_console();

            //Parallelogram
            Parallelogram parallelogram = new Parallelogram(new Point(0,0),new Point(5,0),new Point(7,3),new Point(2,3),"31415");
            parallelogram.setRandomColor();
            parallelogram.print_console();
            parallelogram.saveAsTxt();

            // Rectangle
            Rectangle rectangle = new Rectangle(new Point(4,1),new Point(6,1),new Point(6,6),new Point(4,6));
            rectangle.print_console();
            rectangle.plotOnConsole();

            //Square
            Square square = new Square(new Point(0,0),new Point(9,0),new Point(9,9),new Point(0,9));
            square.setRandomColor();
            square.print_console();
            square.plotOnConsole();

    }
    
}
