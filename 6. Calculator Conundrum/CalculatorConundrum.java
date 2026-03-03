// https://exercism.org/tracks/java/exercises/calculator-conundrum

class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) throw new IllegalArgumentException(
            "Operation cannot be null"
        );
        if (operation.equals("")) throw new IllegalArgumentException(
            "Operation cannot be empty"
        );
        if (operation.equals("+")) {
            return String.format(
                "%d + %d = %d",
                operand1,
                operand2,
                (operand1 + operand2)
            );
        } else if (operation.equals("*")) {
            return String.format(
                "%d * %d = %d",
                operand1,
                operand2,
                (operand1 * operand2)
            );
        } else if (operation.equals("/")) {
            if (operand2 == 0) {
                throw new IllegalOperationException(
                    "Division by zero is not allowed",
                    new ArithmeticException("Division by zero is not allowed")
                );
            }
            return String.format(
                "%d / %d = %d",
                operand1,
                operand2,
                (operand1 / operand2)
            );
        } else {
            throw new IllegalOperationException(
                String.format("Operation '%s' does not exist", operation)
            );
        }
    }
}
