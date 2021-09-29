import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class DiceGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userInput;
        int diceValue = diceThrow();
        boolean diceEven = false;
        boolean validGuess = false;

        do {
            System.out.print("Odd or even?: ");
            userInput = in.nextLine();

            if (userInput.toLowerCase(Locale.ROOT).equals("even")
                    || userInput.toLowerCase(Locale.ROOT).equals("odd")) {
                validGuess = true;
            } else {
                System.out.println("Type only odd or even!.");
            }
        } while (!validGuess);

        if (userInput.toLowerCase(Locale.ROOT).equals("even"))
            diceEven = true;

        if (diceEven) {
            if (diceValue == 2 || diceValue == 4 || diceValue == 6) {
                System.out.println("Correct, the die landed on: " + diceValue + ".");
            } else {
                System.out.println("Incorrect, better luck next time!");
            }
        }
        if (!diceEven) {
            if (diceValue == 1 || diceValue == 3 || diceValue == 5) {
                System.out.println("Correct, the die landed on: " + diceValue + ".");
            } else {
                System.out.println("Incorrect, better luck next time!");
            }
        }
    }

    public static int diceThrow() {
        Random rand = new Random();
        int diceValue;
        diceValue = rand.nextInt(6) + 1;
        return diceValue;
    }

}
