package subsysterm.var;

public enum Mode {
    NORMAL(10000),
    DEFROST(30000);

    private int value;

    Mode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}