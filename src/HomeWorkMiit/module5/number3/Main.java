package HomeWorkMiit.module5.number3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Russian("Иван"),
                new British("Adam"),
                new Chinese("Lee"));

        for (Person person : personList) {
            System.out.println(person.sayHello());
        }
    }
}
