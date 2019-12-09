package pl.lafk;

/**
 * User input after conversion.
 * Another implementation of GuessableNumber.
 *
 * @author Tomasz @LAFK_pl Borek
 * @see GuessableNumber
 */
class ChosenNumber extends BaseNumber {

    ChosenNumber(int chosen) {
        super(chosen);
    }

    @Override
    public String toString() {
        return String.valueOf(chosen);
    }

    @Override
    public Answer isTheOne(Number guess) {
        throw new UnsupportedOperationException(" a chosen number cannot be the one");
    }

}
