package pl.lafk;

import java.util.Scanner;

/**
 * User Interface class.
 *
 * @author Tomasz @LAFK_pl Borek
 */
class UI {

    static ChosenNumber askForNumber() {
        UI.say("Choose a number from a range: ");
        return new ChosenNumber(new Scanner(System.in).nextInt());
    }

    private static void say(String s) {
        System.out.println(s);
    }
}
