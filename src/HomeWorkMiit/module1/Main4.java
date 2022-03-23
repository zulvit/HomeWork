package HomeWorkMiit.module1;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] array = numbers.split(" ");

        boolean flag;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            flag = false;

            for (int j = i; j < array.length - 1; j++) {
                if (!(Integer.parseInt(array[i]) > Integer.parseInt(array[j + 1]))) {
                    flag = true;
                }
                if (flag) break;
            }
            if (!flag) result.append(array[i]).append(" ");
        }

        System.out.println(result.substring(0, result.length() - 1));
    }
}
