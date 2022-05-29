package HomeWorkMiit.module5.number1;

public class Audi implements Car {
    private final String model;
    private final String color;
    private final int horsePower;
    private final String countryProduced;

    public Audi(String model, String color, int horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return "This is " + model + " produced in " + countryProduced + " and have " + TIRES + " tires";
    }
}
