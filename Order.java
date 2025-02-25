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

    public void addItem(String item, double price) {
        items.add(item);
        prices.add(price);
    }

    public double getTotalPrice() {
        totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public double getDiscountedPrice() {
        discountedPrice = totalPrice - (totalPrice * customer.discount);
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
