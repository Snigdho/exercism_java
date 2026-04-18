// https://exercism.org/tracks/java/exercises/resistor-color-trio

import java.util.Map;

class ResistorColorTrio {

    private static final Map<String, Integer> COLOR_MAP = Map.of(
        "black",
        0,
        "brown",
        1,
        "red",
        2,
        "orange",
        3,
        "yellow",
        4,
        "green",
        5,
        "blue",
        6,
        "violet",
        7,
        "grey",
        8,
        "white",
        9
    );

    String label(String[] colors) {
        int first = COLOR_MAP.get(colors[0]);
        int second = COLOR_MAP.get(colors[1]);
        int zeros = COLOR_MAP.get(colors[2]);

        long value = (first * 10L + second);

        // apply multiplier (add zeros)
        value *= Math.pow(10, zeros);

        // format result
        if (value >= 1_000_000_000) {
            return (value / 1_000_000_000) + " gigaohms";
        } else if (value >= 1_000_000) {
            return (value / 1_000_000) + " megaohms";
        } else if (value >= 1_000) {
            return (value / 1_000) + " kiloohms";
        } else {
            return value + " ohms";
        }
    }
}
