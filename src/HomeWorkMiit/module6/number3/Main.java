package HomeWorkMiit.module6.number3;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "resources\\example.txt";
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader1 = new FileReader(path)) {
            while (fileReader1.ready()) {
                stringBuilder.append((char) fileReader1.read());
            }

            String s = stringBuilder.toString();
            s = s.replace("\r\n", "");
            s = s.replace(" ", "");

            System.out.println(s.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
