package baseball.constants;

public enum IntegerConstants {

    NUMBERS_LENGTH(3),
    NUMBERS_MIN_RAGNE(1),
    NUMBERS_MAX_RANGE(9),
    END_CONDITION_STRIKE_COUNT(3);

    private final int value;

    IntegerConstants(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
