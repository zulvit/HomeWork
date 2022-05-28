package HomeWorkMiit.module4.number3;

public class Quadrilateral extends Polygon{
    private final int[] sides;

    public Quadrilateral(int[] sides) throws Exception {
        super(sides);
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Quadrilateral contains " + this.sides.length + " sides\n"
                + super.toString();
    }
}
