package pl.lafk;

/**
 * This class... no, don't ever write a Javadoc like that.
 * It's redundant. Instead try this:
 *
 * Tells if given Number is too high, too low or correct.
 *
 * @author Tomasz @LAFK_pl Borek
 */
class RandomNumber {
    private int nr;

    RandomNumber(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return String.valueOf(nr);
    }
}
