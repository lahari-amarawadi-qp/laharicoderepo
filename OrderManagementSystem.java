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

    private static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Total: $" + order.getTotalPrice());
        System.out.println("Discounted Total: $" + order.getDiscountedPrice());
        System.out.println("Items: " + order.getItems());
        System.out.println("Thank you for shopping with us!");
    }
}
