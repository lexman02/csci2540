/*
 * @author Xavier McNeill
 * Calculator class to convert infix expressions to postfix expressions and evaluate postfix expression
 */
package assg7_mcneillx20;

import java.util.Stack;

public class Calculator {
    String infixExp, postfixExp = "";

    /*
     * Initializes the infix expression
     * @param exp The infix expression
     */
    public Calculator(String exp) {
        infixExp = exp;
    }

    /*
     * Returns the infix expression
     * @return The infix expression
     */
    @Override
    public String toString() {
        return infixExp;
    }

    /*
     * Calculate the length of each number in the infix and postfix expressions
     * @param digits The string of the expression
     * @return The number represented as a string
     */
    private String getDigits(String digits) {
        String result = "";

        if (digits.length() > 1) {
            for (int i = 0; i < digits.length(); i++) {
                if (Character.isDigit(digits.charAt(i))) {
                    result += digits.charAt(i);
                } else {
                    break;
                }
            }
        } else if (Character.isDigit(digits.charAt(0))) {
            result = digits;
        }

        return result;
    }

    /*
     * Checks if the character is an operator
     * @param c The character to check
     */
    private boolean operator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    /*
     * Checks the precedence of the operator using the rules of "PEMDAS"
     * @param operator The operator to check
     */
    private int higherPrecedence(char operator) {
        int position = 5;

        switch (operator) {
        case '*':
            position = 1;
            break;
        case '/':
            position = 2;
            break;
        case '+':
            position = 3;
            break;
        case '-':
            position = 4;
            break;
        }

        return position;
    }

    /*
     * Creates postfix expression
     * @return True if successful, false otherwise
     */
    private boolean convertPostfix() {
        Stack<Character> postfixStack = new Stack<Character>();

        for (int i = 0; i < infixExp.length(); i++) {
            String digits = getDigits(infixExp.substring(i));

            if (infixExp.charAt(i) == ' ') {
            } else if (digits.length() > 0) {
                postfixExp += digits + " ";
                i += digits.length() - 1;
            } else if (infixExp.charAt(i) == '(') {
                postfixStack.push(infixExp.charAt(i));
            } else if (infixExp.charAt(i) == ')') {
                while (postfixStack.peek() != '(') {
                    postfixExp += postfixStack.pop() + " ";
                }
                postfixStack.pop();
            } else if (operator(infixExp.charAt(i))) {
                while (!postfixStack.empty()
                        && higherPrecedence(infixExp.charAt(i)) >= higherPrecedence(postfixStack.peek())) {
                    postfixExp += postfixStack.pop() + " ";
                }
                postfixStack.push(infixExp.charAt(i));
            } else {
                return false;
            }
        }

        while (!postfixStack.empty()) {
            postfixExp += postfixStack.pop() + " ";
        }

        return true;
    }

    /*
     * Returns the resulting postfix expression
     * @return The resulting postfix expression
     * @throws IllegalStateException
     */
    public String getPostfix() throws IllegalStateException {
        if (postfixExp.isEmpty() && !convertPostfix()) {
            throw new IllegalStateException("Invalid infix expression");
        }

        return postfixExp;
    }

    /*
     * Evaluates the expression
     * @return The result of the expression
     */
    public int evaluate() throws IllegalStateException {
        if (postfixExp.isEmpty()) {
            throw new IllegalStateException("Invalid infix expression");
        }

        Stack<Integer> postfixStack = new Stack<Integer>();

        for (int i = 0; i < postfixExp.length(); i++) {
            String digits = getDigits(postfixExp.substring(i));

            if (!digits.isBlank()) {
                postfixStack.push(Integer.parseInt(digits));
                i += digits.length();
            } else if (operator(postfixExp.charAt(i))) {
                int firstOperand = postfixStack.pop();
                int secondOperand = postfixStack.pop();

                switch (higherPrecedence(postfixExp.charAt(i))) {
                case 1:
                    postfixStack.push(secondOperand * firstOperand);
                    break;
                case 2:
                    postfixStack.push(secondOperand / firstOperand);
                    break;
                case 3:
                    postfixStack.push(secondOperand + firstOperand);
                    break;
                case 4:
                    postfixStack.push(secondOperand - firstOperand);
                    break;
                }
            }
        }

        return postfixStack.pop();
    }
}
