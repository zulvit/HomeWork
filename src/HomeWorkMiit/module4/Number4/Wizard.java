package HomeWorkMiit.module4.Number4;

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

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    private boolean spell() throws Exception {
        if (this.mana <= 0) {
            throw new Exception("Wrong value to wizard's mana");
        }
        if (this.spellPower <= 0) {
            throw new Exception("Wrong value to wizard's spell power");
        }
        return true;
    }

    @Override
    public String action() {
        try {
            spell();
            this.mana = this.mana - this.spellPower;
            return username + " spell with power " + spellPower;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}
