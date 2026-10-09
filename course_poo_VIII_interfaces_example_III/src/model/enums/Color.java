package model.enums;


public enum Color {
	// 1 Enum constants (must come first):
    BLACK(0),
    WHITE(1);

	// 2. Fields (attributes):
    private final int code;

    // 3. Constructor:
    Color(int code) {
        this.code = code;
    }

    
    // 4. Methods::
    // Getter:
    public int getCode() {
        return code;
    }

    // Optional method: search enums by code:
    public static Color fromCode(int code) {
        for (Color color : Color.values()) {
            if (color.code == code) {
                return color;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}
