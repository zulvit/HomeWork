package HomeWorkMiit.module3;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        ArrayList<Car> arrayList = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String numbers = scanner1.nextLine();
            String[] array = numbers.split(" ");

            Car car = new Car();
            car.setMake(array[0]);
            car.setModel(array[1]);
            car.setHorsePower(Integer.parseInt(array[2]));
            arrayList.add(car);
        }

        for (Car a : arrayList) {
            System.out.println(a.getInfo());
        }
    }
}

class Car {
    private String make;
    private String model;
    private int horsePower;

//    public Car(String make, String model, int horsePower) {
//        this.make = make;
//        this.model = model;
//        this.horsePower = horsePower;
//    }

//    public Car(String make) {
//        this.make = make;
//        this.model = "unknown";
//        this.horsePower = -1;
//    }


    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "The car is: " + getMake() + " " + getModel() + " - " + getHorsePower() + " HP.";
    }

    public String getInfo() {
        return toString();
    }
}
