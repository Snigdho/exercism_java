// https://exercism.org/tracks/java/exercises/wizards-and-warriors-2

public class GameMaster {

    public String describe(Character c) {
        return String.format(
            "You're a level %d %s with %d hit points.",
            c.getLevel(),
            c.getCharacterClass(),
            c.getHitPoints()
        );
    }

    public String describe(Destination d) {
        return String.format(
            "You've arrived at %s, which has %d inhabitants.",
            d.getName(),
            d.getInhabitants()
        );
    }

    public String describe(TravelMethod tm) {
        String description = "You're traveling to your destination";
        switch (tm) {
            case WALKING:
                description += " by walking.";
                break;
            case HORSEBACK:
                description += " on horseback.";
                break;
        }
        return description;
    }

    public String describe(Character c, Destination d, TravelMethod tm) {
        return (
            this.describe(c) + " " + this.describe(tm) + " " + this.describe(d)
        );
    }

    public String describe(Character c, Destination d) {
        return this.describe(c, d, TravelMethod.WALKING);
    }
}
