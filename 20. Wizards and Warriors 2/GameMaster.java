// https://exercism.org/tracks/java/exercises/wizards-and-warriors-2

public class GameMaster {

    public String describe(Character c) {
        return (
            "You're a level " +
            c.getLevel() +
            " " +
            c.getCharacterClass() +
            " with " +
            c.getHitPoints() +
            " hit points."
        );
    }

    public String describe(Destination d) {
        return (
            "You've arrived at " +
            d.getName() +
            ", which has " +
            d.getInhabitants() +
            " inhabitants."
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
