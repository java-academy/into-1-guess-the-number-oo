package pl.lafk;

import java.io.PrintStream;
import java.io.PrintWriter;
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
    private PrintStream err;

    UI(Scanner scanner, PrintStream out, PrintStream err) {
        in = scanner;
        this.out = out;
        this.err = err;
    }

    UI() {
        this(new Scanner(System.in), System.out, System.err);
    }

    Range parse(String[] args) {
        say("Program accepts parameters: floor and ceiling");
        if (args.length == 2) {
            try {
                int floor = Integer.valueOf(args[0]);
                int ceiling = Integer.valueOf(args[1]);
                say(String.format("<%d,%d>",floor,ceiling));
                return new Range(floor, ceiling);
            } catch (NumberFormatException nfe) {
                err(nfe.getMessage());
            }
        }
        final Range range = new Range();
        say("Running the default range "+ range.toString());
        return range;
    }


    ChosenNumber askForNumber() {
        say("Choose a number from a range: ");
        return new ChosenNumber(in.nextInt());
    }

    void say(String s) {
        out.println(s);
    }

    void err(String s) {err.println(s);}
}
