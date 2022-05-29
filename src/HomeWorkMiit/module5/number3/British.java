package HomeWorkMiit.module5.number3;

public class British extends BasePerson {
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
