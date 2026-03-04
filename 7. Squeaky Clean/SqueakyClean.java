// https://exercism.org/tracks/java/exercises/squeaky-clean

class SqueakyClean {

    static String clean(String identifier) {
        String replacedSpaces = identifier.replace(" ", "_");
        String camelCased = toCamelCase(replacedSpaces);
        String leetspoken = toLeetSpeak(camelCased);
        String cleaned = leetspoken.replaceAll("[^a-zA-Z_]", "");

        return cleaned;
    }

    private static String toCamelCase(String input) {
        String[] parts = input.split("-");
        StringBuilder result = new StringBuilder(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            result
                .append(parts[i].substring(0, 1).toUpperCase())
                .append(parts[i].substring(1));
        }

        return result.toString();
    }

    private static String toLeetSpeak(String input) {
        String s = input.replace('4', 'a');
        s = s.replace('3', 'e');
        s = s.replace('0', 'o');
        s = s.replace('1', 'l');
        s = s.replace('7', 't');
        return s;
    }
}
