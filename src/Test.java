import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> list = new ArrayList<>();
        int number = scanner.nextInt();
        String str;
        for (int i = 0; i < number; i++) {
            Scanner scanner1 = new Scanner(System.in);
            str = scanner1.nextLine();
            String[] params = str.split(" ");
            Car num = new Car();
            num.setMake(params[0]);
            num.setModel(params[1]);
            num.setHorsePower(Integer.parseInt(params[2]));
            list.add(num);
        }

        for (Car car : list) {
            car.getInfo();
        }
    }
}

class Car {
    public String make;
    public String model;
    public int horsePower;


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
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

    public void getInfo() {
        System.out.printf("The car is: " + "%s %s - %d HP.\n", this.getMake(), this.getModel(), this.getHorsePower());
    }
}