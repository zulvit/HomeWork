package HomeWorkMiit.module4.number4;

public class Elf extends Hero {
    private int arrowsCount;
    private final String username;

    public Elf(String username, int level, int arrowsCount) {
        super(username, level);
        this.arrowsCount = arrowsCount;
        this.username = username;
        System.out.printf("Elf %s [%s level] is online\n", username, level);
    }

    public void setArrowsCount(int arrowsCount) throws Exception {
        if (arrowsCount < 1 || arrowsCount > 100) throw new Exception();
        this.arrowsCount = arrowsCount;
    }

    private boolean shotArrow() {
        if (arrowsCount <= 0) {
            System.out.println(username + " has no more arrows");
            return false;
        }
        return true;
    }

    @Override
    public String action() {
        if (shotArrow()) {
            return username + " shoot arrow\n";
        }
        return "";
    }
}
