package HomeWorkMiit.module4;

public class Vehicle {
    private int passengers;

    public Vehicle(int passengers) throws Exception {
        this.setPassengers(passengers);
    }

    private void setPassengers(int passengers) throws Exception {
        if (passengers < 0) {
            throw new Exception("Need passengers to drive");
        } else {
            this.passengers = passengers;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengers=" + passengers +
                '}';
    }
}
