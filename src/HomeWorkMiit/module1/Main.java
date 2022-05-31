package HomeWorkMiit.module1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int[] array = new int[counter];

        for (int i = 0; i < counter; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        String result = Arrays.toString(array)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");

        System.out.print(result);
        System.out.println("\n" + sum);
    }
}