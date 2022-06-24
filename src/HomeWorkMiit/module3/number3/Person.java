package HomeWorkMiit.module3.number3;

public class Person {
    private final String name;
    private final int age;
    int buka;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getPositiveBuka() {
        return buka;
    }

    public void setBuka(int buka) throws Exception {
        if (buka >= 0) {
            this.buka = buka;
        } else {
            throw new Exception("Число не может быть отрицательным");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
