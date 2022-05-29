package HomeWorkMiit.module4.Number4;

public class Knight extends Hero {
    private int strength;
    private int impactForce;
    private final String username;

    public Knight(String username, int level, int strength, int impactForce) {
        super(username, level);
        this.strength = strength;
        this.impactForce = impactForce;
        this.username = username;
        System.out.printf("Knight %s [%s level] is online\n", username, level);
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setImpactForce(int impactForce) {
        this.impactForce = impactForce;
    }

    private boolean fight() {
        return false;
    }

    @Override
    public String action() {
        return username + " fight with force " + impactForce + '\n';
    }
}
