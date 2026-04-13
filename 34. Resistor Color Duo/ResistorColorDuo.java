// https://exercism.org/tracks/java/exercises/resistor-color-duo

class ResistorColorDuo {

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

    int value(String[] colors) {
        return this.getColorCode(colors[0]) * 10 + this.getColorCode(colors[1]);
    }

    private int getColorCode(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (COLORS[i].equals(color)) {
                return i;
            }
        }
        return -1; // not required by Exercism, but safe fallback
    }
}
