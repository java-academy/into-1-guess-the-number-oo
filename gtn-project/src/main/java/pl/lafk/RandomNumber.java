package pl.lafk;

/**
 * This class... no, don't ever write a Javadoc like that.
 * It's redundant. Instead try this:
 *
 * Tells if given Number is too high, too low or correct.
 *
 * @author Tomasz @LAFK_pl Borek
 */
class RandomNumber implements GuessableNumber {
    private int nr;

    RandomNumber(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return String.valueOf(nr);
    }

    @Override
    public Answer isTheOne(Number guess) {
        return new Answer(compareTo(guess));
    }

    @Override
    public int compareTo(Number o) {
        return 0;
    }
}
