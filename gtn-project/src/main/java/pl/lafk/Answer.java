package pl.lafk;

enum Answer {
    TOO_HIGH,TOO_LOW,CORRECT;

    /**
     * @param compareAnswer an int that should've come from a valid compareTo implementation, that is one of three is possible: -1, 0, 1
     * @return a proper answer based on the assumption that the number is correct.
     */
    static Answer of(int compareAnswer) {
        final String errorMsg = "static factory on Answer had it's contract violated: number was %d and was NOT in range <-1,1>";
        assert compareAnswer > -2 && compareAnswer < 2 : String.format(errorMsg, compareAnswer);
        switch(compareAnswer) {
            case -1:
                return TOO_LOW;
            case 1:
                return TOO_HIGH;
            default:
                return CORRECT;
        }
    }

    @Override
    public String toString() {
        return this.name();
    }
}
