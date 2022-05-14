package HomeWorkMiit.module4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String strInput = scanner1.nextLine();
        String[] input = strInput.split(" ");

        String type = input[0];
        String[] params = new String[input.length - 1];
        System.out.println(type);
        for (int i = 1; i <= params.length; i++) {
            params[i - 1] = input[i];
        }
        try {
            switch (type) {
                case "Car": {

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
