package pl.lafk;

import java.util.Objects;

/**
 * @author Tomasz @LAFK_pl Borek
 */
abstract class BaseNumber extends Number implements GuessableNumber {
    // for children classes
    @SuppressWarnings("encapsulation")
    protected int chosen;

    BaseNumber(int chosen) {
        this.chosen = chosen;
    }

    @Override
    public int intValue() {
        return chosen;
    }

    @Override
    public long longValue() {
        return chosen;
    }

    @Override
    public float floatValue() {
        return chosen;
    }

    @Override
    public double doubleValue() {
        return chosen;
    }

    @Override
    public int compareTo(Number o) {
        final int oVal = o.intValue();
        return Integer.compare(chosen, oVal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseNumber)) return false;
        BaseNumber that = (BaseNumber) o;
        return chosen == that.chosen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chosen);
    }
}
