package HomeWorkMiit.module5.number2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Collections.unmodifiableList(new ArrayList<>() {{
            add(new Russian("Иван"));
            add(new British("Adam"));
            add(new Chinese("Lee"));
        }});

        for (Person person : personList) {
            System.out.println(person.sayHello());
        }
    }
}
