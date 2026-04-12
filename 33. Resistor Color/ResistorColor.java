// https://exercism.org/tracks/java/exercises/resistor-color

class ResistorColor {

    private static final String[] COLORS = {
        "black",
        "brown",
        "red",
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white",
    };

    int colorCode(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (COLORS[i].equals(color)) {
                return i;
            }
        }
        return -1; // not required by Exercism, but safe fallback
    }

    String[] colors() {
        return COLORS;
    }
}
