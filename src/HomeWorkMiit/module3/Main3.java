package HomeWorkMiit.module3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        Person[] people = new Person[counter];
        for (int i = 0; i < counter; i++) {
            people[i].name = scanner.nextLine();
            people[i].age = scanner.nextInt();
        }
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
