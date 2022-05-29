package HomeWorkMiit.module5.number3;

public class Chinese extends BasePerson {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Ni Hao!";
    }
}
