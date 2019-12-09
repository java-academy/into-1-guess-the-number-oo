package pl.lafk;

/**
 * Comparable to other Numbers, can tell if it's too high, too low or correct.
 */
interface GuessableNumber extends Comparable<Number> {

    /**
     * @see Answer
     * @param guess - another number to compare
     * @return answer - one of three 'possibles'
     */
    Answer isTheOne(Number guess);
}
