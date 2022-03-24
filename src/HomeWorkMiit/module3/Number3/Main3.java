package HomeWorkMiit.module3.Number3;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Scanner scanner1 = new Scanner(System.in);
            String input = scanner1.nextLine();
            String[] arrayWords = input.split(" ");
            personList.add(new Person(arrayWords[0], Integer.parseInt(arrayWords[1])));
        }

        for (int i = 0; i < personList.size(); i++) {
            Collections.sort(personList, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    byte[] arrayO1 = o1.getName().getBytes();
                    byte[] arrayO2 = o2.getName().getBytes();
                    return arrayO1[0] - arrayO2[0];
                }
            });
        }

        for (Person p : personList) {
            if (p.getAge() > 30) {
                System.out.println(p.getName());
            }
        }
    }
}
