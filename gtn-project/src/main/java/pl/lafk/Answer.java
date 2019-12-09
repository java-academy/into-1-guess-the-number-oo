package pl.lafk;

import java.util.stream.IntStream;

enum Answer {
    TOO_HIGH,TOO_LOW,CORRECT;

    /**
     * @param compareAnswer an int that should've come from a valid compareTo implementation, that is one of three is possible: -1, 0, 1
     * @return a proper answer based on the assumption that the number is correct.
     */
    static Answer of(int compareAnswer) {
        final String errorMsg = "static factory on Answer had it's contract violated: number was %d and was NOT in range <-1,1>";
        assert compareAnswer > -2 && compareAnswer < 2 : String.format(errorMsg, compareAnswer);
        switch(compareAnswer) {
            case -1:
                return TOO_HIGH;
            case 1:
                return TOO_LOW;
            default:
                return CORRECT;
        }
    }

    @Override
    public String toString() {
        return this.name().replace("_", " ");
    }


    /**
     * Wykorzystaj do sprawdzenia czy asercje działają na Twojej maszynie.
     * Na produkcji nie powinny.
     * @see <a href="https://docs.oracle.com/cd/E19683-01/806-7930/assert-5/index.html">programistyczne włączanie asercji</a>
     * @see <a href="https://stackoverflow.com/questions/19966620/enable-assert-in-a-maven-built-project">włączanie asercji Mavenem</a>
     */
    public static void main(String[] args) {
        System.out.println("Testujemy asercje - jeśli widzisz dużo CORRECT to nie są włączone");

        IntStream.rangeClosed(-5,5).forEach(i -> {
            try {
                System.out.println(Answer.of(i));
            } catch (AssertionError ae) {
                System.err.println(ae.getMessage());
            }
        });
    }

}
