// https://exercism.org/tracks/java/exercises/acronym

class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        String[] words = phrase.split("[ _-]+");
        String result = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                result += Character.toUpperCase(word.charAt(0));
            }
        }
        this.acronym = result;
    }

    String get() {
        return this.acronym;
    }
}
