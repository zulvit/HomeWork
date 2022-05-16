package HomeWorkMiit.module6.number1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "resources\\example.txt";
        List<Character> punctuationMarks = new ArrayList<>();
        punctuationMarks.add(',');
        punctuationMarks.add('.');
        punctuationMarks.add('(');
        punctuationMarks.add(')');
        punctuationMarks.add('!');
        punctuationMarks.add(':');
        punctuationMarks.add('!');
        punctuationMarks.add('-');
        punctuationMarks.add('?');
        punctuationMarks.add(';');
        punctuationMarks.add('–');

        int counter = 0;
        try (FileReader fileReader1 = new FileReader(path)) {
            while (fileReader1.ready()) {
                if (punctuationMarks.contains((char) fileReader1.read())) {
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
