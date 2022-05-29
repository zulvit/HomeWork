package HomeWorkMiit.module5.number3;

public class Russian extends BasePerson {
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
