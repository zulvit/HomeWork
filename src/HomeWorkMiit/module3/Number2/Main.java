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
            String[] arrayWords = input.split(" ");
            /*
                arrayWords[0] - Первая строка
                arrayWords[1] - Вторая строка(ID клиента)
                arrayWords[2] - Третья строка(депозит)
             */
            try {
                switch (arrayWords[0]) {
                    case "Create" -> list.add(new BankAccount());
                    case "Deposit" -> {
                        BankAccount bankAccount = list.get(Integer.parseInt(arrayWords[1]) - 1);
                        bankAccount.deposit(Integer.parseInt(arrayWords[2]));
                    }
                    case "SetInterest" -> BankAccount.setInterestRate(Double.parseDouble(arrayWords[1]));
                    case "GetInterest" -> {
                        BankAccount bankAccount = list.get(Integer.parseInt(arrayWords[1]) - 1);
                        System.out.println(bankAccount.getInterest(Integer.parseInt(arrayWords[2])));

                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Account does not exist");
            }

            if (input.equals("End")) notEnd = false;
        }
    }
}
