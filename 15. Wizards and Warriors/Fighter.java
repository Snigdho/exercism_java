class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean hasSpellPrepared;

    public void Fighter() {
        this.hasSpellPrepared = false;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.hasSpellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !this.hasSpellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return this.hasSpellPrepared ? 12 : 3;
    }
}
