package HomeWorkMiit.module4;

public class Boat extends Vehicle {
    private int oarsCount;


    public Boat(int passengers, int oarsCount) throws Exception {
        super(passengers);
        this.setOarsCount(oarsCount);
    }

    private void setOarsCount(int oarsCount) throws Exception {
        if (oarsCount <= 0) {
            throw new Exception("Лодка не поплывёт.");
        }
        this.oarsCount = oarsCount;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "oarsCount=" + oarsCount +
                '}';
    }
}
