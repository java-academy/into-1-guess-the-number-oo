package pl.lafk;

enum Answer {
    TOO_HIGH(1),TOO_LOW(-1),CORRECT(0);

    private int val;

    Answer(int val) {
        this.val = val;
    }

    static Answer of(int compareAnswer) {
        switch(compareAnswer) {
            case -1: return TOO_LOW;
            case 1: return TOO_HIGH;
            case 0: return CORRECT;
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
