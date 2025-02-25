package entities;

public class Customer {
    String name;
    String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
