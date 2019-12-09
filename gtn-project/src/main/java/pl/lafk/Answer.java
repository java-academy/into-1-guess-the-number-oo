package pl.lafk;

enum Answer {
    TOO_HIGH(1),TOO_LOW(-1),CORRECT(0);

    private int val;

    Answer(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
