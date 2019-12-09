package pl.lafk;

import java.util.Scanner;

import static pl.lafk.Answer.CORRECT;

/**
 * Starts the game, holds the main loop
 *
 * @author Tomasz @LAFK_pl Borek
 */
class GuessTheNumberGame {


    public static void main(String[] args) {
        UI ui = new UI(new Scanner(System.in), System.out);
        ui.say("Welcome in Guess the number game.");
        final Range range = new Range(1, 100);
        ui.say(String.format("You need to find a secret number chosen from a range of %s", range.toString()));
        final RandomNumber randomized = range.randomize();
        ChosenNumber chosen = null;
        Answer theOne = null;
        do {
            chosen = ui.askForNumber();
            System.out.println(chosen);
            theOne = randomized.isTheOne(chosen);
            ui.say(theOne.toString());
        } while (!theOne.equals(CORRECT));
        ui.say("Ending the game");
    }

}
