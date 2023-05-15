

public class ArithmeticExpression {
    public static void main(String[] args) {
        String input = "1+2-7+2-1+28+2+3-37+22";
        int result = evaluateExpression(input);
        System.out.println("Result: " + result);
    }

    private static int evaluateExpression(String input) {
        int result = 0;
        int currentNumber = 0;
        char currentOperator = '+';

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            if (!Character.isDigit(c) || i == input.length() - 1) {
                result = performOperation(result, currentNumber, currentOperator);
                currentNumber = 0;
                currentOperator = c;
            }
        }

        return result;
    }

    private static int performOperation(int result, int number, char operator) {
        if (operator == '+') {
            return result + number;
        } else if (operator == '-') {
            return result - number;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
