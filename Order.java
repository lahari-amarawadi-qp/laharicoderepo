package entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Customer customer;
    List<String> items;
    List<Double> prices;
    double totalPrice;
    double discountedPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    private double calculateAndGetTotal() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    private double applyDiscountAndGet() {
        discountedPrice = totalPrice - (totalPrice * customer.discount);
        return discountedPrice;
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + calculateAndGetTotal());
        System.out.println("Discounted Price: " + applyDiscountAndGet());
    }
}
