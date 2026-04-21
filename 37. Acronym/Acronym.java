// https://exercism.org/tracks/java/exercises/acronym
import java.lang.Character;

class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        String[] words = phrase.split("[ _-]+");
        StringBuilder result = new StringBuilder();
        // String result = ""; // also works with String
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                // result += Character.toUpperCase(word.charAt(0)); // for String
            }
        }
        this.acronym = result.toString();
        // this.acronym = result;
    }

    String get() {
        return this.acronym;
    }
}
