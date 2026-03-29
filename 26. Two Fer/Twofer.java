// https://exercism.org/tracks/java/exercises/two-fer

public class Twofer {

    public String twofer(String name) {
        return (
            "One for " +
            ((name == null || name.isEmpty()) ? "you" : name) +
            ", one for me."
        );
    }
}
