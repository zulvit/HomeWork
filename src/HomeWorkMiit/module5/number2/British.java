package HomeWorkMiit.module5.number2;

public class British implements Person {
    private String name;

    public British(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello!";
    }
}
