package pl.lafk;

import java.util.Random;

/**
 * @author Tomasz @LAFK_pl Borek
 */
class Range {
    private final int floor;
    private final int ceiling;

    Range(int floor, int ceiling) {
        this.floor = floor;
        this.ceiling = ceiling;
    }

    @Override
    public String toString() {
        return String.format("<%d,%d>", floor, ceiling);
    }

    RandomNumber randomize() {
        return new RandomNumber(new Random().nextInt(ceiling)+1);
    }
}
