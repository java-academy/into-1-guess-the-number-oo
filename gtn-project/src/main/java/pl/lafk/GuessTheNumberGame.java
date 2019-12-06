package pl.lafk;

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
        ChosenNumber chosen = UI.askForNumber();
        do {

        } while randomized.
    }
}
