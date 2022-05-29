package HomeWorkMiit.module4.Number4;

public class Elf extends Hero {
    private int arrowsCount;
    private final String username;

    public Elf(String username, int level, int arrowsCount) {
        super(username, level);
        this.arrowsCount = arrowsCount;
        this.username = username;
        System.out.printf("Elf %s [%s level] is online\n", username, level);
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    private boolean shotArrow() {
        return false;
    }

    @Override
    public String action() {
        return username + " shoot arrow\n";
    }
}
