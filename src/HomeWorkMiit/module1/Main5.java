package HomeWorkMiit.module1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int num = scanner.nextInt();

        String[] array = numbers.split(" ");

        LinkedList<String> arrayList = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = Integer.parseInt(array[i]) + Integer.parseInt(array[j]);
                if (sum == num) {
                    arrayList.add(array[i] + " " + array[j]);
                    break;
                }
            }
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
