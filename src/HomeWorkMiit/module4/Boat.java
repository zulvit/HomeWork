package HomeWorkMiit.module4;

public class Boat extends Vehicle {
    private int oarsCount;


    public Boat(int passengers, int oarsCount) throws Exception {
        super(passengers);
        this.setOarsCount(oarsCount);
        System.out.printf("In a Boat %s passengers \n" +
                        "With %s oars",
                passengers, oarsCount);
    }

    private void setOarsCount(int oarsCount) throws Exception {
        if (oarsCount < 0) {
            throw new Exception("Invalid negative number");
        } else if (oarsCount == 0) {
            throw new Exception("Need oars to swim");
        } else {
            this.oarsCount = oarsCount;
        }
    }

    @Override
    public String toString() {
        return "Boat{" +
                "oarsCount=" + oarsCount +
                '}';
    }
}
