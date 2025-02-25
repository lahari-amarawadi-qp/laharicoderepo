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
        calculateTotal();
    }

    public void calculateTotal() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        applyDiscount();
    }

    public void applyDiscount() {
        discountedPrice = totalPrice - (totalPrice * customer.discount);
    }

    public void printOrder() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
