// https://exercism.org/tracks/java/exercises/high-scores

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return this.highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        sortedScores.sort(Collections.reverseOrder());

        int end = Math.min(3, sortedScores.size());
        return new ArrayList<>(sortedScores.subList(0, end));
    }
}
