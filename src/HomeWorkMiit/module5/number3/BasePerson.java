package HomeWorkMiit.module5.number3;

public abstract class BasePerson implements Person {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String sayHello();
}
