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

    // TODO: define a 'describe' method that returns a description of a Destination

    // TODO: define a 'describe' method that returns a description of a TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod

    // TODO: define a 'describe' method that returns a description of a Character and Destination
}
