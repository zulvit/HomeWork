package HomeWorkMiit.module3.Number2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean notEnd = true;
        while (notEnd) {
            String input = scanner.nextLine();
            if (input.equals("Create")) {
                list.add(new BankAccount());
            }

            if (input.equals("End")) notEnd = false;
        }
    }
}
