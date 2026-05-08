import java.util.List;

public class Order {

    private Customer customer;
    private List<Item> items;

    // NEW FIELD
    private double totalAmount;

    public Order(
            Customer customer,
            List<Item> items,
            double totalAmount
    ) {

        this.customer = customer;
        this.items = items;

        // NEW
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }

    // NEW METHOD
    public double getTotalAmount() {
        return totalAmount;
    }
}
