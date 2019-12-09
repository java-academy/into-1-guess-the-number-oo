package pl.lafk;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Tomasz @LAFK_pl Borek
 */
class Range {
    private final int floor;
    private final int ceiling;

    Range() {
        this(1,100);
    }

    Range(int floor, int ceiling) {
        int tmp_floor = Math.min(floor,ceiling);
        int tmp_ceiling = Math.max(floor, ceiling);
        this.floor = Math.max(tmp_floor,0);
        this.ceiling = Math.min(Integer.MAX_VALUE, tmp_ceiling);
    }

    @Override
    public String toString() {
        return String.format("<%d,%d>", floor, ceiling);
    }

    RandomNumber randomize() {
        return new RandomNumber(new Random().nextInt(ceiling-floor)+floor+1);
    }
}
