package HomeWorkMiit.module4;

public class Airplane extends Vehicle {
    private int wingsCount;
    private int enginesNumber;
    private boolean isHydroplane;

    public Airplane(int passengers, int wingsCount, int enginesNumber, boolean isHydroplane) throws Exception {
        super(passengers);
        this.setWingsCount(wingsCount);
        this.setEnginesNumber(enginesNumber);
        this.setHydroplane(isHydroplane);
        if (isHydroplane) {
            System.out.printf("In a Airplane %s passengers \n" +
                            "With %s wings and %s engines",
                    passengers, wingsCount, enginesNumber);
        } else {
            System.out.printf("In a Hydroplane %s passengers \n" +
                            "With %s wings and %s engines",
                    passengers, wingsCount, enginesNumber);
        }
    }

    public void setWingsCount(int wingsCount) throws Exception {
        if (wingsCount < 0) {
            throw new Exception("Invalid negative number");
        } else if (wingsCount == 0) {
            throw new Exception("Need wings to fly");
        } else {
            this.wingsCount = wingsCount;
        }
    }

    public void setEnginesNumber(int enginesNumber) throws Exception {
        if ((enginesNumber >= 0 && enginesNumber <= 8) || enginesNumber == 10 || enginesNumber == 12) {
            this.enginesNumber = enginesNumber;
        } else {
            throw new Exception("Invalid engines number");
        }
    }

    public void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "wingsCount=" + wingsCount +
                ", enginesNumber=" + enginesNumber +
                ", isHydroplane=" + isHydroplane +
                '}';
    }
}
