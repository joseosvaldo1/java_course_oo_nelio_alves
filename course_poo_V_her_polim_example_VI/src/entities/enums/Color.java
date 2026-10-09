package entities.enums;

public enum Color {
	BLACK(0),
    BLUE(1),
    RED(2);

    private final int code;

    Color(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
	

}
