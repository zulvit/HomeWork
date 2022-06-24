package HomeWorkMiit.module4.number4;

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

    public void setStrength(int strength) throws Exception {
        if (strength > 100 || strength < 1) throw new Exception();
        this.strength = strength;
    }

    public void setImpactForce(int impactForce) throws Exception {
        if (impactForce < 0 || impactForce > this.strength) throw new Exception();
        this.impactForce = impactForce;
    }

    private boolean fight() {
        if (this.strength <= 0) {
            System.out.println(username + " has no more strength");
            return false;
        }
        return true;
    }

    @Override
    public String action() {
        if (fight()) {
            return username + " fight with force " + impactForce + '\n';
        }
        return "";
    }
}
