package HomeWorkMiit.module1;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input1 = scanner.nextLine();

        String[] words = input.split(" ");
        String[] words1 = input1.split(" ");

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words1.length; j++) {
                if (words[i].equals(words1[j])) {
                    arrayList.add(words[i]);
                    break;
                }
            }
        }

        Collections.reverse(arrayList);
        String[] wordsArray = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            wordsArray[i] = arrayList.get(i);
        }

        String result = Arrays.toString(wordsArray)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");

        System.out.println(result);
    }
}