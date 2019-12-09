package pl.lafk;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * User Interface keeps the communication with the user open.
 * This effectively happens through {@link java.util.Scanner} and {@link java.io.PrintStream}
 *
 * Reason for existence: if I choose to change the UI from console to graphics then I'm ready.
 *
 * @author Tomasz @LAFK_pl Borek
 */
class UI {

    private Scanner in;
    private PrintStream out;

    UI(Scanner scanner, PrintStream out) {
        in = scanner;
        this.out = out;
    }

    ChosenNumber askForNumber() {
        say("Choose a number from a range: ");
        return new ChosenNumber(in.nextInt());
    }

    void say(String s) {
        out.println(s);
    }
}
