package HomeWorkMiit.module4.number3;

public class Circle extends Polygon {
    private final int radius;

    public Circle(int[] sides) throws Exception {
        super(sides);
        radius = sides[0];
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    private double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle radius is " + radius + '\n' +
                "Its perimeter is " + String.format("%.2f", getPerimeter()) + '\n' +
                "Its area is " + String.format("%.2f", getArea());
    }
}
