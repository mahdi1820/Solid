import java.util.List;

public class Main {
        public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculator_V2 = new AreaCalculator_V2();
        Circle circle = new Circle (10);
        Square square = new Square (10);
        Cube cube = new Cube ();
        Rectangle rectangle = new Rectangle();
        ShapesPrinter printer = new ShapesPrinter(areaCalculator_V2);
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(
                                    
                                    circle,
                                    square,
                                    cube,
                                    rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes ));
        System.out.println(printer.csv(shapes));
        }
    }

