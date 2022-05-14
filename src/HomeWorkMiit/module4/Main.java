package HomeWorkMiit.module4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] input = line.split(" ");

        String typeOfVehicle = input[0];
        String[] parameters = new String[input.length - 1];
        System.arraycopy(input, 1, parameters, 0, input.length - 1);

        try {
            switch (typeOfVehicle) {
                case "Car" -> new Car(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]), parameters[2]);
                case "Airplane" -> new Airplane(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), Boolean.parseBoolean(parameters[3]));
                case "Boat" -> new Boat(Integer.parseInt(parameters[0]), Integer.parseInt(parameters[1]));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
