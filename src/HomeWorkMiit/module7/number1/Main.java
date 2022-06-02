package HomeWorkMiit.module7.number1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        Stack<String> stack = new Stack<>();
        for (String s : inputArr) {
            stack.push(s);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
            stringBuilder.append(" ");
        }

        System.out.print(stringBuilder.deleteCharAt(stringBuilder.length() - 1));

    }
}
