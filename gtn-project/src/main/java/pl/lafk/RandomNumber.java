package pl.lafk;

import java.util.Objects;

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
        return Answer.of(compareTo(guess));
    }

    @Override
    public int compareTo(Number o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RandomNumber)) return false;
        RandomNumber that = (RandomNumber) o;
        return nr == that.nr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nr);
    }
}
