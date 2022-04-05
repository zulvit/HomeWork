package HomeWorkMiit.module2;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int countParameters = 3;

        int[][] matrix = new int[length][countParameters];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < countParameters; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int numberTrain = scanner.nextInt();
        int countPassengers = 0;


        int[] trainCar = new int[length];
        for (int i = 0; i < length; i++) {
            trainCar[i] = matrix[i][0];
        }

        boolean flag = false;
        for (int i = 0; i < trainCar.length; i++) {
            if (trainCar[i] == numberTrain) {
                flag = true;
                break;
            }
        }

        if (flag) {
            for (int[] ints : matrix) {
                if (numberTrain == ints[0]) {
                    countPassengers += ints[countParameters - 1];

                }
            }
            System.out.println(countPassengers);
        } else {
            System.out.println("Error");
        }
    }
}
