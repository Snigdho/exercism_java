// https://exercism.org/tracks/java/exercises/armstrong-numbers

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberStr = String.valueOf(numberToCheck);
        int numDigits = numberStr.length();

        int sum = 0;
        for (char digitChar : numberStr.toCharArray()) {
            int digit = digitChar - '0';
            sum += Math.pow(digit, numDigits);
        }

        return sum == numberToCheck;
    }
}
