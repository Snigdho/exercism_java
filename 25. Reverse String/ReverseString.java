// https://exercism.org/tracks/java/exercises/reverse-string

class ReverseString {

    String reverse(String inputString) {
        if (inputString == null) return null; // handles null first
        StringBuilder reversed = new StringBuilder(inputString);
        return reversed.reverse().toString();
    }
}
