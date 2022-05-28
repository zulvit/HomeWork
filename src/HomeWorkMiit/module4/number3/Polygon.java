package HomeWorkMiit.module4.number3;

public class Polygon {
    private final int[] sides;

    public Polygon(int[] sides) throws Exception {
        // region validation
        if (!(sides.length == 1 || sides.length > 2)) {
            throw new Exception("Invalid value to sides number");
        }
        for (int side : sides) {
            if (side < 0) {
                throw new Exception("Negative value to side length " + side);
            }
        }
        // endregion
        this.sides = sides;
    }

    private int getSidesCount() {
        return sides.length;
    }

    public double getPerimeter() {
        int perimeter = 0;
        for (int i = 0; i < getSidesCount(); i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return "Polygon contains " + sides.length + " sides\n" +
                "Its perimeter is " + getPerimeter();
    }
}
