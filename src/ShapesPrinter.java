import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }
 
    public String json(List<Shape>shapes){
        return "{ShapesSum: %s}".formatted(
            areaCalculator.sum(shapes)
        );
    }
    
    public String csv(List<Shape>shapes){
        return "Shapes_Sum: %s".formatted(
            areaCalculator.sum(shapes)
        );
    }
}
