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
class RandomNumber extends BaseNumber {
    RandomNumber(int nr) {
        super(nr);
    }

    @Override
    public String toString() {
        return String.valueOf(chosen);
    }

    @Override
    public Answer isTheOne(Number guess) {
        return Answer.of(compareTo(guess));
    }

}
