package HomeWorkMiit.module4.number3;

public class Triangle extends Polygon {
    private final int[] sides = new int[3];

    public Triangle(int[] sides) throws Exception {
        super(sides);
        System.arraycopy(sides, 0, this.sides, 0, sides.length);
        if (!(this.sides[0] + this.sides[1] < this.sides[2])) {
            throw new Exception("Wrong to side length " + this.sides[2]);
        } else if (!(this.sides[1] + this.sides[2] < this.sides[0])) {
            throw new Exception("Wrong to side length " + this.sides[0]);
        }
    }

    private double getInRadius() {
        double perimeter = 0;
        double square = 0;
        //calc perimeter
        for (int side : sides) {
            perimeter += side;
        }
        double semiPerimeter = perimeter / 2;
        //calc square
        double s = Math.sqrt(semiPerimeter * (semiPerimeter - sides[0]) * (semiPerimeter - sides[1]) * (semiPerimeter - sides[2]));
        return s / semiPerimeter;
    }

    @Override
    public String toString() {
        return "Triangle contains 3 sides" + '\n' +
                super.toString() + '\n' +
                "Its radius of in circle is " + String.format("%.2f", getInRadius());
    }
}
