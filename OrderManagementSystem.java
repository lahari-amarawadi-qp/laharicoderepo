package manager;
import entities.Customer;
import entities.Order;

class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "VIP");
        Order order = new Order(customer);

        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);

        order.printOrder();

        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.customer.name);
        System.out.println("Total: $" + order.totalPrice);
        System.out.println("Discounted Total: $" + order.discountedPrice);
        System.out.println("Items: " + order.items);
        System.out.println("Thank you for shopping with us!");
    }
}
