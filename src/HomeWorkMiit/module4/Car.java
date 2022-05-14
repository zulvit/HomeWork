package HomeWorkMiit.module4;

public class Car extends Vehicle {
    private int horsePower;
    private String model;

    public Car(int passengers, int horsePower, String model) throws Exception {
        super(passengers);
        this.setHorsePower(horsePower);
        this.setModel(model);
        System.out.printf("In a Car %s passengers \n" +
                        "With %s horse power",
                passengers, horsePower);
    }

    private void setHorsePower(int horsePower) throws Exception {
        if (horsePower < 0) {
            throw new Exception("С 0 до кальянной за 4 секунды. (пешком)");
        }
        this.horsePower = horsePower;
    }

    private void setModel(String model) throws Exception {
        if (model.length() < 2) {
            throw new Exception("Invalid short value");
        }
        this.model = model;
    }
}
