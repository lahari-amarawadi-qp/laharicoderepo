package entities;

import java.util.Arrays;
import java.util.List;

public enum CustomerType {
    REGULAR(0, "Regular", 0.05),
    PREMIUM(1, "Premium", 0.1),
    VIP(2, "VIP", 0.2);

    private int value;
    private String type;
    private double discount;

    CustomerType(int value, String name, double discount) {
        this.value = value;
        this.type = name;
        this.discount = discount;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }

    public static List<CustomerType> getAll() {
        return Arrays.asList(values());

    }

    public static CustomerType getByType(String type) {
        return getAll().stream().filter(type -> type.getType().equals(type)).findFirst()
                .orElse(REGULAR);
    }
}
