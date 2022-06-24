package HomeWorkMiit.module4.number4;

public class Wizard extends Hero {
    private int mana;
    private int spellPower;
    private final String username;

    public Wizard(String username, int level, int mana, int spellPower) {
        super(username, level);
        this.mana = mana;
        this.spellPower = spellPower;
        this.username = username;
        System.out.printf("Wizard %s [%s level] is online\n", username, level);
    }

    public void setMana(int mana) throws Exception {
        if (mana < 1 || mana > 100) {
            throw new Exception("Wrong value to wizard's mana");
        }
        this.mana = mana;
    }

    public void setSpellPower(int spellPower) throws Exception {
        if (spellPower < 0 || spellPower > this.mana) {
            throw new Exception("Wrong value to wizard's spell power");
        }
        this.spellPower = spellPower;
    }

    private boolean spell() {
        if (mana <= 0) {
            System.out.println(username + " has no more mana");
            return false;
        }
        return true;
    }

    @Override
    public String action() {
        try {
            if (spell()) {
                this.mana = this.mana - this.spellPower;
                return username + " spell with power " + spellPower;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}
