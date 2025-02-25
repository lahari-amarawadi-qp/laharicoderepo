package entities;

public class Customer {
    String name;
    String type;
    double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        discount = CustomerType.getByType(type).getDiscount();
    }
}