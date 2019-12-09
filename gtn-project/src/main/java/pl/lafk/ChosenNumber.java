package pl.lafk;

/**
 * User input after conversion.
 * Another implementation of GuessableNumber.
 *
 * @author Tomasz @LAFK_pl Borek
 * @see GuessableNumber
 */
class ChosenNumber implements GuessableNumber{
    private int chosen;

    ChosenNumber(int chosen) {
        this.chosen = chosen;
    }

    @Override
    public String toString() {
        return String.valueOf(chosen);
    }

    @Override
    public Answer isTheOne(Number guess) {
        throw new UnsupportedOperationException(" a chosen number cannot be the one");
    }

    @Override
    public int compareTo(Number o) {
        final int oVal = o.intValue();
        return Integer.compare(chosen, oVal);
    }

}
