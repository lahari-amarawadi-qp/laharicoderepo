package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Customer customer;
    List<String> items;
    List<Double> prices;
    double totalPrice;
    double discountedPrice;

    public List<String> getItems() {
        return items;
    }

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        prices.add(Item.getByName(item) == null ? 0 : Item.getByName(item).getPrice());
    }

    public double getTotalPrice() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public double getDiscountedPrice() {
        discountedPrice = totalPrice - (totalPrice * CustomerType.getByType(customer.type).getDiscount());
        return discountedPrice;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("Discounted Price: " + getDiscountedPrice());
    }
}
