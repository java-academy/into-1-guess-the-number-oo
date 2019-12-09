package pl.lafk;

import java.util.stream.IntStream;

/**
 * Starts the game, holds the main loop
 *
 * @author Tomasz @LAFK_pl Borek
 */
class GuessTheNumberGame {

    public static void main(String[] args) {
        System.out.println("Welcome in Guess the number game.");
        System.out.print("You need to find a secret number chosen from a range");
        final Range range = new Range(1, 100);
        System.out.println(" of " + range.toString());
        final RandomNumber randomized = range.randomize();
        System.out.println(randomized);
        ChosenNumber chosen = null;
        testAsercji();
        do {
            chosen = UI.askForNumber();
            System.out.println(chosen);
        } while (randomized.isTheOne(null).equals(Answer.CORRECT));
    }

    private static void testAsercji() {
        IntStream.rangeClosed(-5,5).forEach(i -> {
            try {
                System.out.println(Answer.of(i));
            } catch (AssertionError ae) {
                System.err.println(ae.getMessage());
            }
        });
    }
}
