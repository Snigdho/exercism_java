// https://exercism.org/tracks/java/exercises/dnd-character

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        // Remove the lowest roll and sum the rest
        scores.sort(Collections.reverseOrder());
        return scores.get(0) + scores.get(1) + scores.get(2);
    }

    List<Integer> rollDice() {
        Random random = new Random();
        List<Integer> rolls = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            rolls.add(random.nextInt(6) + 1); // 1–6
        }

        return rolls;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
