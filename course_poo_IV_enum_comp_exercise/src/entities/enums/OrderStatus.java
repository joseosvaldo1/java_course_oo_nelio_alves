package entities.enums;

public enum OrderStatus {
	// 1 Enum constants (must come first)
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

	// 2. Fields (attributes)
    private final int code;

    // 3. Constructor
    OrderStatus(int code) {
        this.code = code;
    }

    
    // 4. Methods::
    // Getter:
    public int getCode() {
        return code;
    }

    // Método opcional: buscar enum por código
    public static OrderStatus fromCode(int code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + code);
    }
}
