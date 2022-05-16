package HomeWorkMiit.module6.number2;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "resources\\example.txt";

        int counter = 0;
        try (FileReader fileReader1 = new FileReader(path)) {
            while (fileReader1.ready()) {
                char s = (char) fileReader1.read();
                if (s >= '0' && s <= '9') {
                    counter += Integer.parseInt(String.valueOf(s));
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
