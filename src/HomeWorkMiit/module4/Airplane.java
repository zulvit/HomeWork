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
    }

    public void setWingsCount(int wingsCount) throws Exception {
        if (wingsCount <= 0) {
            throw new Exception("Я не полечу");
        } else {
            this.wingsCount = wingsCount;
        }
    }

    public void setEnginesNumber(int enginesNumber) {
        this.enginesNumber = enginesNumber;
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
