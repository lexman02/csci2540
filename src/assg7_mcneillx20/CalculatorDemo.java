/*
 * @author Xavier McNeill
 * A class that prompts the user for an infix expression to convert and evaluate until they enter "q" or "Q"
 */
package assg7_mcneillx20;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        String input;
        Scanner kbd = new Scanner(System.in);

        do {
            System.out.println("Enter an infix expression (1 + 1) or \"q\" to quit: ");
            input = kbd.nextLine();

            if (!input.contains("q") && !input.contains("Q")) {
                Calculator calc = new Calculator(input);

                System.out.println("\nPostfix expression: " + calc.getPostfix());
                System.out.println("Result: " + calc.evaluate() + "\n");
            }

        } while (!input.contains("q") && !input.contains("Q"));

        kbd.close();
    }
}
