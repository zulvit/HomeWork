package HomeWorkMiit.module5.number2;

public class Russian implements Person {
    private String name;

    public Russian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Привет!";
    }
}
