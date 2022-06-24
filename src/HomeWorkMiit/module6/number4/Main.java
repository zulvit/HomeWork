package HomeWorkMiit.module6.number4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "resources\\example2.txt";
        int counter = 0;
        int index = 0;
        int num0 = 0;
        int num1 = 0;
        char actionNumber = 0;
        int result = 0;

        //region Read file
        try (FileReader fileReader1 = new FileReader(path)) {
            StringBuilder stringBuilder = new StringBuilder();
            while (fileReader1.ready()) {
                char c = (char) fileReader1.read();
                if (c == '/' || c == '*' || c == '+' || c == '-') {
                    index = counter;
                    if (c == '/') actionNumber = '/';
                    if (c == '*') actionNumber = '*';
                    if (c == '+') actionNumber = '+';
                    if (c == '-') actionNumber = '-';
                }
                counter++;
                stringBuilder.append(c);
            }
            StringBuilder num0Str = new StringBuilder();
            StringBuilder num1Str = new StringBuilder();
            for (int i = 0; i < index; i++) {
                num0Str.append(stringBuilder.charAt(i));
            }
            for (int i = index + 1; i < stringBuilder.length(); i++) {
                num1Str.append(stringBuilder.charAt(i));
            }
            num0 = Integer.parseInt(num0Str.toString());
            num1 = Integer.parseInt(num1Str.toString());
            result = switch (actionNumber) {
                case '/' -> num0 / num1;
                case '*' -> num0 * num1;
                case '+' -> num0 + num1;
                case '-' -> num0 - num1;
                default -> 0;
            };
            System.out.println(stringBuilder + "=" + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //endregion

        //region Write file
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(num0 + "" + actionNumber + "" + num1 + "=" + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //endregion
    }
}
