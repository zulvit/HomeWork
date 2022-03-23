package HomeWorkMiit.module1;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] array = numbers.split(" ");

        int[] arrayOnInt = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOnInt[i] = Integer.parseInt(array[i]);
        }

        int shift = scanner.nextInt();
        arrayOnInt = shiftLeft(arrayOnInt, shift);
        String[] result = new String[arrayOnInt.length];

        for (int i = 0; i < arrayOnInt.length; i++) {
            result[i] = String.valueOf(arrayOnInt[i]);
        }

        String output = Arrays.toString(result)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");

        System.out.println(output);
    }

    public static int[] shiftLeft(int[] a, int shift) {
        int length = shift;
        int[] result = new int[length];
        System.arraycopy(a, shift, result, 0, length - shift);
        System.arraycopy(a, 0, result, length - shift, shift);
        return result;
    }
}

