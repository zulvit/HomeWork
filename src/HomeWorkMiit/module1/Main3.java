package HomeWorkMiit.module1;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();
        String[] arrayString = numbers.split(" ");
        int[] array = new int[arrayString.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayString[i]);
        }

        int counterSteps = scanner.nextInt();
        int temp;

        if (counterSteps > array.length) {
            counterSteps = counterSteps % array.length;
        }

        for (int i = 0; i < counterSteps; i++) {
            temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }

        String result = Arrays.toString(array)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");

        System.out.println(result);
    }
}

