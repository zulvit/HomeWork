package HomeWorkMiit.module4.number3;

public class Rhombus extends Parallelogram {
    private final int[] sides;

    public Rhombus(int[] sides) throws Exception {
        super(sides);
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Rhombus contains " + this.sides.length + " equal sides\n"
                + "Its perimeter is " + getPerimeter();
    }
}
